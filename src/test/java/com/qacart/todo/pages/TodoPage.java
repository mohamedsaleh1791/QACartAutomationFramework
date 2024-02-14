package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodoPage extends BasePage {

    public TodoPage(WebDriver driver) {
        super(driver);
    }

    By welcomeMsg = By.cssSelector("[data-testid=\"welcome\"]");
    By add = By.cssSelector("[data-testid=\"add\"]");
    By newTodo = By.cssSelector("[data-testid=\"new-todo\"]");
    By addTodoButton = By.cssSelector("[data-testid=\"submit-newTask\"]");
    By todoItem = By.cssSelector("[data-testid=\"todo-item\"]");

    public WebElement getWelcomeMsg() {
        return driver.findElement(welcomeMsg);
    }

    public WebElement addElement() {
        return driver.findElement(add);
    }

    public WebElement addTodoButtonElement() {
        return driver.findElement(addTodoButton);
    }

    public WebElement newTodoElement() {
        return driver.findElement(newTodo);
    }
    public WebElement todoItemElement() {
        return driver.findElement(todoItem);
    }

    public boolean isWelcomeMsgDisplayed() {
        return getWelcomeMsg().isDisplayed();
    }

    public void clickAddButton() {
        addElement().click();
    }

    public void dataOfNewTodo(String data) {
        newTodoElement().sendKeys(data);
    }

    public void cliAddTodoButton() {
        addTodoButtonElement().click();
    }
    public String getTodoItemName(){
        return todoItemElement().getText();
    }

}
