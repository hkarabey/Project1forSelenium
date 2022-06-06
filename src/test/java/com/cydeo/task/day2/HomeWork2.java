package com.cydeo.task.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork2 {

     @Test

    public void test(){

         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         driver.get("http://zero.webappsecurity.com/login.html");

         String actualTitle=driver.findElement(By.xpath("//h3[.='Log in to ZeroBank']")).getText();

         String expectedTitle="Log in to ZeroBank";

         Assert.assertTrue(actualTitle.equals(expectedTitle),"title is wrong");

     }


}
