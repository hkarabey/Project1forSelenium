package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://library2.cybertekschool.com/login.html");

        WebElement emailBox= driver.findElement(By.className("form-control"));
        emailBox.sendKeys("incorrect@email.com");
        Thread.sleep(2000);

        WebElement passwordBox= driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("incorrectpassword");
        Thread.sleep(2000);

        WebElement signİn= driver.findElement(By.tagName("button"));
        signİn.click();

        String expectedResult="Sorry, Wrong Email or Password";



    }


}
