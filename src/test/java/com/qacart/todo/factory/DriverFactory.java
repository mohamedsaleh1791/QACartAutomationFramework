package com.qacart.todo.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
       private WebDriver driver;
       public WebDriver initializeDriver(){
           driver=new FirefoxDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
           return driver;
       }

}
