package com.cydeo.task.day2;

import com.cydeo.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3 {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test(){

        driver.navigate().to("https://google.com");
        WebElement google=driver.findElement(By.xpath("//input[@name='q']"));
        google.sendKeys("apple"+ Keys.ENTER);
        String expected="apple";
        String actual=driver.getTitle();
        Assert.assertTrue(actual.startsWith(expected),"title is  wrong");


    }

}
