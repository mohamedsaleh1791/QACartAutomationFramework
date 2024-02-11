package com.qacart.todo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;


public class App 
{
    public static void main( String[] args )
    {

        System.setProperty("webdriver.chrome.driver","E:\\demo\\QACartSeleniumTraining\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//      driver.get("http://qacart-todo.herokuapp.com/login");
//      driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("hatem@example.com");
//      driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Test1234");
//      driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//      driver.findElement(By.cssSelector("[data-testid=\"complete-task\"]")).click();

//      driver.get("https://hatem-hatamleh.github.io/Selenium-html/actions.html");
//      Select level=new Select(driver.findElement(By.id("level")));
//        level.selectByValue("senior");
//        driver.get("file://E:\\demo\\QACartSeleniumTraining\\src\\main\\resources\\index.html");
//        WebElement btn=driver.findElement(By.xpath("//input[contains(@class,'double-click')]"));
//        Actions action=new Actions(driver);
//        action.doubleClick(btn).build().perform();
//        System.out.println(btn.getAttribute("value"));
//        action.contextClick(btn).perform();
//        System.out.println(btn.getAttribute("value"));
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
        String parent=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@class='button website']")).click();
        Set<String> allWindows=driver.getWindowHandles();
        for (String window:allWindows){
            if(!window.equalsIgnoreCase(parent)){
                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.close();

            }
        }




    }
}
