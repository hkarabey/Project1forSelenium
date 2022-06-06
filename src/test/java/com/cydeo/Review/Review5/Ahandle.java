package com.cydeo.Review.Review5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Ahandle {

    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://shino.de/parkcalc/");

        WebElement calendar= driver.findElement(By.xpath("(//img[@alt='Pick a date'])[1]"));
        calendar.click();

        Set<String>windowHnadle=driver.getWindowHandles();
        System.out.println(windowHnadle);

    }



}
