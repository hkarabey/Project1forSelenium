package com.cydeo.task.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1 {

    @Test

    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com");

        String expectedUrl="cydeo";
        String expectedTitle="Practice";

        String actualUrl=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle),"title is wrong");
        Assert.assertTrue(actualUrl.contains(expectedUrl),"url is wrong");

    }


}
