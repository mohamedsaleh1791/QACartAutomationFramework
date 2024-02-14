package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void shouldBeAbleLoginWithValidUserNameAndPassword(){

        LoginPage loginPage=new LoginPage(driver);
        TodoPage todoPage=new TodoPage(driver);
        loginPage.loadPage();
        loginPage.login("test1791@test.com","Ms@123456");
        boolean isWelcomeDisplayed=todoPage.isWelcomeMsgDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
    }
}
