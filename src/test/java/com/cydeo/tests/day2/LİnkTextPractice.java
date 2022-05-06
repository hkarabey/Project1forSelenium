package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LİnkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com/");

        //driver.findElement(By.linkText("A/B Testing"));
        WebElement abTest= driver.findElement(By.linkText("A/B Testing"));
        abTest.click();

        Thread.sleep(4000);

        //driver.get("https://practice.cydeo.com/abtest");

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("verifiying A/B title testing passed");
        } else {
            System.out.println("verifiying A/B title testing failed");
        }
        Thread.sleep(4000);
        driver.navigate().back();

        String expectedTitleBack = "Practice";
        String actualTitleBack = driver.getTitle();
        if (expectedTitleBack.equals(actualTitleBack)) {
            System.out.println("back title testing pased");
        } else {
            System.out.println("back title testing failed");
        }


    }


}
