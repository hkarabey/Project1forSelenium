package com.cydeo.task.day2;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5 {

    @Test
    public void test(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/registration_form");
        String expectedResult="Registration form";
        String actualResult=driver.findElement(By.xpath("//h2[.='Registration form']")).getText();

        Assert.assertTrue(expectedResult.equals(actualResult),"header is false");

        //input[@name='firstname']

        WebElement firstNmae =driver.findElement(By.xpath("//input[@name='firstname']"));
       String firstNameAtt= firstNmae.getAttribute("name");
        System.out.println("firstNameAtt = " + firstNameAtt);

        Assert.assertTrue(firstNameAtt.equals("firstname"),"placeholder is false");


    }


}
