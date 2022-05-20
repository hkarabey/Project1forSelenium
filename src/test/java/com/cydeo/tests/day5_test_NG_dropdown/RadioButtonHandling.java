package com.cydeo.tests.day5_test_NG_dropdown;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButtonHandling {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyButton=driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());


    }


}
