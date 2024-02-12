package com.qacart.todo.pages;
import com.qacart.todo.base.BasePage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    private By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private By submit = By.cssSelector("[data-testid=\"submit\"]");


    public WebElement getEmail() {
        return driver.findElement(emailInput);
    }
    public WebElement getPassword() {
        return driver.findElement(passwordInput);
    }
    public WebElement click() {
        return driver.findElement(submit);
    }
    public void loadPage(){
        driver.get("https://todo.qacart.com/");
    }


    public void login(String userName,String password){
        getEmail().sendKeys(userName);
        getPassword().sendKeys(password);
        click().click();
    }
}
