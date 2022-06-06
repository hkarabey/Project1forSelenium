package com.cydeo.tests.day11_practice;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JsExecuter_scrolDown_Up {

    @Test
    public void test8() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("uploadURL2"));

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();


        WebElement cydeoLink=Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));

        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        //Actions actions=new Actions(Driver.getDriver());
       // actions.moveToElement(cydeoLink).perform();

        Thread.sleep(2000);
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink,homeLink);



    }


}
