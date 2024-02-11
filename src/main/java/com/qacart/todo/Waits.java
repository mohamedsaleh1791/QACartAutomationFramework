package com.qacart.todo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\demo\\QACartSeleniumTraining\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Thread.sleep(4000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("primary"))).click();
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));

        driver.findElement(By.className("secondary")).click();
    }
}
