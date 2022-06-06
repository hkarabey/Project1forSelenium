package com.cydeo.task.day2;

import com.cydeo.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4 {
   WebDriver driver;
    @BeforeTest
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("http://library2.cybertekschool.com/login.html");

        WebElement email =driver.findElement(By.xpath("//input[@id='inputEmail']"));
        Thread.sleep(3000);
        email.sendKeys("incorrectemail@gmail.com");

        WebElement password=driver.findElement(By.xpath("//input[@id='inputPassword']"));
        Thread.sleep(3000);
        password.sendKeys("incorrectpassword");

        WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
        signIn.click();

        String expectedResult="Sorry, Wrong Email or Password";
        String actualResult=driver.findElement(By.xpath("//div[.='Sorry, Wrong Email or Password']")).getText();
        System.out.println("actualResult = " + actualResult);
        Assert.assertTrue(expectedResult.equals(actualResult));


    }

}
