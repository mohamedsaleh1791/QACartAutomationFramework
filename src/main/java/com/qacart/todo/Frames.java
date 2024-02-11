package com.qacart.todo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\demo\\QACartSeleniumTraining\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");
    }
}
