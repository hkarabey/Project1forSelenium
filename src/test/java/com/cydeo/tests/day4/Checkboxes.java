package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkboxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        WebElement cehckbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("cehckbox1.isSelected() = " + cehckbox1.isSelected());

        cehckbox1.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        checkbox2.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        System.out.println("cehckbox1.isSelected() = " + cehckbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());


    }
}
