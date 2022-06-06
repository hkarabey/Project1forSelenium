package com.cydeo.tests.day8_Properties.Eample;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.Kernel;
import java.util.concurrent.TimeUnit;

public class Google {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){

        String browserType= ConfigurationReader.getProperty("browser");

        driver= WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");


    }

    @Test
    public void test() throws InterruptedException {
        WebElement serach =driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        serach.sendKeys("apples"+ Keys.ENTER);




       String actualTitle= driver.getTitle();
       String expectedTitle="apples - Google'da Ara";

        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }


}
