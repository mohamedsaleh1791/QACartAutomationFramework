package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void shouldBeAbleLoginWithValidUserNameAndPassword(){
        driver.get("https://todo.qacart.com/");
        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("test1791@test.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Ms@123456");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        boolean welcomeIsDisplayed=driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
        Assert.assertTrue(welcomeIsDisplayed);
    }
}
