package com.cydeo.tests.day5_test_NG_dropdown;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleDropdown {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void simpleDropDownTest(){

        Select simpleDropDown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelected=simpleDropDown.getFirstSelectedOption();

        String expectedSelected="Please select an option";

        String actualCurrentlySelected=currentlySelected.getText();

        Assert.assertTrue(expectedSelected.equals(actualCurrentlySelected));


        System.out.println("-------------");
        Select selectDropDown=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement currentlySelectDropDown=selectDropDown.getFirstSelectedOption();
        String actualcURRENTLYSelectedDropDown=currentlySelectDropDown.getText();
        String expedtedSelectedDropDown="Select a State";

        Assert.assertEquals(actualcURRENTLYSelectedDropDown,expedtedSelectedDropDown);

    }





}
