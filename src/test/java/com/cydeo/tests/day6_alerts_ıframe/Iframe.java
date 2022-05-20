package com.cydeo.tests.day6_alerts_ıframe;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void test1() {

        driver.switchTo().frame("mce_0_ifr");

        WebElement currentIframe = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(currentIframe.isDisplayed());

        WebElement parentIframe = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(parentIframe.isDisplayed());
    }


}
