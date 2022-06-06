package com.cydeo.task.day2;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork1 {

    @Test
    public void test(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com");

        WebElement search =driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedTitle="Wooden spoon | Etsy";
        String actaulTitle=driver.getTitle();

        Assert.assertTrue(actaulTitle.equals(expectedTitle),"search title is false");






    }



}
