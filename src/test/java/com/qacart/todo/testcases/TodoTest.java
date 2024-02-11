package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddNewTodo(){


        driver.get("https://todo.qacart.com/");
        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("test1791@test.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Ms@123456");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Java");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        String todoItemTXT=driver.findElement(By.cssSelector("[data-testid=\"todo-item\"]")).getText();
        Assert.assertEquals(todoItemTXT,"Learn Java");

    }
    @Test
    public void shouldBeAbleToDeleteTodo(){
        driver.get("https://todo.qacart.com/");
        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("test1791@test.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Ms@123456");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"delete\"]")).click();
    }

}
