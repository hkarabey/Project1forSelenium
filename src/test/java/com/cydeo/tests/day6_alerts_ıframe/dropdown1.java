package com.cydeo.tests.day6_alerts_ıframe;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropdown1 {
    WebDriver driver;
    @BeforeClass

            public void setUp() {
       driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void test1() throws InterruptedException {

        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

        WebElement state=driver.findElement(By.xpath("//select[@id='state']"));

        Select select=new Select(state);
        select.selectByValue("IL");


        Thread.sleep(2000);



        select.selectByVisibleText("Virginia");

        Thread.sleep(2000);



       select.selectByVisibleText("California");

        String expected="California";

        String actual=select.getFirstSelectedOption().getText();


        Assert.assertTrue(actual.equals(expected),"last selection is not california");




    }

}
