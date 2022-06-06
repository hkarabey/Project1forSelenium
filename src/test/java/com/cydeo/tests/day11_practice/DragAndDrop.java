package com.cydeo.tests.day11_practice;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {


    @Test

    public void drag_and_drop_test() throws InterruptedException {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cokkies=Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        cokkies.click();
        Thread.sleep(6000);


         WebElement smalCircle= Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
         WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));






        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smalCircle,bigCircle).perform();

        String expectedResult="You did great!";
        String actualResult= bigCircle.getText();
        System.out.println("actualResult = " + actualResult);
        Assert.assertTrue(actualResult.equals(expectedResult),"drag and drop is false");



    }



}
