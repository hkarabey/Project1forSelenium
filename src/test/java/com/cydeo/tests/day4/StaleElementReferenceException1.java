package com.cydeo.tests.day4;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class StaleElementReferenceException1 extends Throwable {
    public static void main(String[] args) {

        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/abtest");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement cydeoLink =driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        //staleelementrefence exception will be occur therefore ı reaaggign the reference connection again

        cydeoLink =driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


    }



}
