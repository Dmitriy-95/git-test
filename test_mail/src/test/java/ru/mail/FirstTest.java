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
    public void firstTest(){
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Mail.Ru: почта, поиск в интернете, новости, игры"));

        WebElement setLogin = driver.findElement(By.id("mailbox:login"));
        setLogin.sendKeys("my_firsttest");
        WebElement setPassword = driver.findElement(By.id("mailbox:password"));
        setPassword.sendKeys("qwerty12345");
        WebElement buttonInput = driver.findElement(By.id("mailbox:submit"));
        buttonInput.click();
//        WebElement controlJump = driver.findElement(By.id("PH_user-email"));
//        String mailUser = controlJump.getText();
//        System.out.println(mailUser);
//        Assert.assertTrue(mailUser.equals("my_firsttest@mail.ru"));

        WebElement openPost = driver.findElement(By.id("ph_mail"));
        openPost.click();

        WebElement messNew = driver.findElement(By.cssSelector("#Lxs9a76 > div > div > div.b-toolbar__group.b-toolbar__group_left > div > a"));
        messNew.click();


//        WebElement recipMassege = driver.findElement(By.cssSelector(".js-input compose__labels__input"));
//        recipMassege.sendKeys("argunovdima@bk.ru");
    }

    @After
    public void stepDown(){
//        driver.quit();
    }
}
