package com.cydeo.tests.day5_test_NG_dropdown;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonContinue {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        List<WebElement> allClick=driver.findElements(By.name("sport"));

        for (WebElement each : allClick) {
            each.click();
        }





verifyRadioButton(driver,"sport","hockey");



    }
private static void verifyRadioButton(WebDriver driver,String nameAttribute,String ıdValue){
    List<WebElement> allClick=driver.findElements(By.name(nameAttribute));

    for (WebElement each : allClick) {
        String attriıd=each.getAttribute("id");
        System.out.println(attriıd);
        if (attriıd.equals(ıdValue)){
            each.click();
            System.out.println(attriıd+" is selected "+each.isSelected());
            break;
        }
    }

}




}
