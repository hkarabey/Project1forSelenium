package com.cydeo.tests.day5_test_NG_dropdown;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("before method");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("after method");
        driver.close();
    }

    @Test
    public void selenium_test() {
        /*
        do browser setup
        open browser
        maximize the page
        implicit wait
        get https://google.com
        assert title is google
         */

        driver.get("https://www.google.com");
        String actual = driver.getTitle();
        String expected = "Google121123";
       Assert.assertTrue(expected.equals(actual),"title is not here");

    }

}
