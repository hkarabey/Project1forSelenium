package com.cydeo.tests.day11_practice;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice_1 {


    @Test
    public void test() throws InterruptedException {


        Driver.getDriver().get(ConfigurationReader.getProperty("uploadURL1"));

       // JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

//js.executeScript("window.scrollBy(0,750)");

        Actions actions=new Actions(Driver.getDriver());
        WebElement poweredByCYDEO=Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        Thread.sleep(2000);
        actions.moveToElement(poweredByCYDEO).perform();

        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        Thread.sleep(2000);

       // actions.moveToElement(homeLink).perform();

        actions.sendKeys(Keys.PAGE_UP).perform();
    }


}
