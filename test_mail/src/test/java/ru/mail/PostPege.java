package ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostPege {
    private WebDriver driver;

    public PostPege(WebDriver driver) {
        this.driver = driver;
    }

    private By writePost = By.cssSelector("a[href*=compose]");

    public void clickWritePost(){
        driver.findElement(writePost).click();
    }
}
