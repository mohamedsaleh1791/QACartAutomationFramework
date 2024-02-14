package com.qacart.todo.testcases;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddNewTodo(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.loadPage();
        loginPage.login("test1791@test.com","Ms@123456");
        TodoPage todoPage=new TodoPage(driver);
        todoPage.clickAddButton();
        todoPage.dataOfNewTodo("Learn Java");
        todoPage.cliAddTodoButton();
        String todoItemTXT=todoPage.getTodoItemName();
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
