package com.cydeo.tests.day10_jsexecuter;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Upload {


    @Test
    public void test() {

        Driver.getDriver().get(ConfigurationReader.getProperty("uploadURL"));


        WebElement upload = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        upload.sendKeys("C:\\Users\\ASUS\\Desktop\\loginfunctionality\\Screenshot_8.png");

        Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']")).click();

        WebElement fileUploedHeader = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));

        Assert.assertTrue(fileUploedHeader.isDisplayed());


    }


}
