package ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By inputEmail = By.xpath("//input[@name = \"login\"]");
    private By inputPassword = By.xpath("//input[@name = \"password\"]");
    private By buttonSubmit = By.xpath("//input[@ value= \"Войти\"]");

    public void setInputEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setInputPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void setButtonSubmit(){
        driver.findElement(buttonSubmit).click();
    }
}
