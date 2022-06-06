package com.cydeo.task.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2 {



    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com");

        WebElement abtest =driver.findElement(By.xpath("//a[.='A/B Testing']"));

        abtest.click();

        String actualTitle= driver.getTitle();
        String expectedTitle="No A/B Test";
        Assert.assertTrue(expectedTitle.equals(actualTitle),"title is wrong");

        driver.navigate().back();
        String expectedTitle2="Practice";
        String actualTitle2=driver.getTitle();
        Assert.assertTrue(expectedTitle2.equals(actualTitle2),"backTitle is wrong");


    }



}
