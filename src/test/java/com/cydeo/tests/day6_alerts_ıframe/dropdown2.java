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

public class dropdown2 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void tets(){
        driver.get("https://practice.cydeo.com/dropdown");
        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        WebElement mounth=driver.findElement(By.xpath("//select[@id='month']"));
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select yearDropdown=new Select(year);
        Select monthDropdown=new Select(mounth);
        Select dayDropdown=new Select(day);

        dayDropdown.selectByValue("1");
        monthDropdown.selectByVisibleText("December");
        yearDropdown.selectByVisibleText("1923");

        String expectedYear="1923";
        String expectedMount="December";
        String expectedDay="1";

        String actaulDay=dayDropdown.getFirstSelectedOption().getText();
        String actualMonth=monthDropdown.getFirstSelectedOption().getText();
        String actualyear=yearDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(expectedDay.equals(actaulDay));
        Assert.assertTrue(expectedMount.equals(actualMonth));
        Assert.assertTrue(expectedYear.equals(actualyear));

    }


}
