package ru.mail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static ChromeDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Users/ТШ/Desktop/Работа/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.ru/");
    }

    @Test
    public void firstTest() throws InterruptedException {
//        my_firsttest
//        qwerty12345
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Mail.Ru: почта, поиск в интернете, новости, игры"));

        HomePage homePage = new HomePage(driver);
        homePage.setInputEmail("my_firsttest");
        homePage.setInputPassword("qwerty12345");
        homePage.setButtonSubmit();

        Thread.sleep(5000);

        PostPege postPege = new PostPege(driver);
        postPege.clickWritePost();

        WritePostPage writePostPage = new WritePostPage(driver);
        writePostPage.setEmailOfUser("argunovdima@bk.ru");
        writePostPage.setSubjectInput("my first autotest");
//        writePostPage.clickBodyInput();
//        writePostPage.setBodyInput("пробный запуск теста");
        writePostPage.clicSubmitSent();

//        if (writePostPage.text.equals("Вы уверены?")){
//            writePostPage.clickButtonFray();
//        }
        Thread.sleep(1000);
        writePostPage.clickButtonFray();
    }

    @After
    public void stepDown(){
//        driver.quit();
    }
}
