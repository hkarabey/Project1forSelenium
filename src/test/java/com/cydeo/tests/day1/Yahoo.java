package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();

        driver.get("https://www.yahoo.com");
        driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle().substring(0,5));



    }
}
