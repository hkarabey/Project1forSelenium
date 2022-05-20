package com.cydeo.tests.day5_test_NG_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XPathPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clickButton=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        clickButton.click();
        WebElement deleteButton=driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("before click the deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        deleteButton.click();




            try {
                System.out.println("after click the deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
            } catch (StaleElementReferenceException e){
                System.out.println("delete button is dispalyed = false");
                System.out.println(" stale element reference exception is occured");
            }


    }


}
