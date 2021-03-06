package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static void returnOrderDate(WebDriver driver,String customerName,String expectedOrderDate){

        String locator="//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell=driver.findElement(By.xpath(locator));


        String actualOrderDate=customerDateCell.getText();
        Assert.assertTrue(expectedOrderDate.equals(actualOrderDate));
    }




}
