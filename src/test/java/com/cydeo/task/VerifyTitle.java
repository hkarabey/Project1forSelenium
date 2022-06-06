package com.cydeo.task;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyTitle {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test(){
        driver.navigate().to("https://www.yahoo.com");
        String actualResult=driver.getTitle();
        String expectedResult="Yahoo";

        Assert.assertTrue(actualResult.contains(expectedResult));

    }




}
