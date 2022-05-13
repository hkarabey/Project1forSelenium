package com.cydeo.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtributeCssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");

        //WebElement login = driver.findElement(By.className("login-btn"));

        // tagName[attribute="value"]

        WebElement login= driver.findElement(By.cssSelector("input[type='submit']"));

        String type=login.getAttribute("value");
        System.out.println(type);

    }

}
