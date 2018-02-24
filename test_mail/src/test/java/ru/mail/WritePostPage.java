package ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WritePostPage {
    private WebDriver driver;

    public WritePostPage(WebDriver driver) {
        this.driver = driver;
    }
//    body[@id="tinymce"]
    private By emailOfUser = By.xpath("//textarea[@data-original-name=\"To\"]");
    private By subjectInput = By.xpath("//input[@name=\"Subject\"]");
    private By bodyInput = By.xpath("//body[@class=\"mceContentBody compose2\"]");
    private By submitSend = By.xpath("//span[text()='Отправить']");
    private By buttonFray = By.xpath("//*[text()='Продолжить']");
    public By text = By.xpath("//*[text()='Вы уверены?']");

    public void setEmailOfUser(String userEmail){
        driver.findElement(emailOfUser).sendKeys(userEmail);
    }

    public void setSubjectInput(String subjectPost){
        driver.findElement(subjectInput).sendKeys(subjectPost);
    }

    public void setBodyInput(String textPost){
        driver.findElement(bodyInput).sendKeys(textPost);
    }

    public void clickBodyInput(){
        driver.findElement(bodyInput).click();
    }

    public void clickButtonFray(){
        driver.findElement(buttonFray).click();
    }

    public void clicSubmitSent(){
        driver.findElement(submitSend).click();
    }

}
