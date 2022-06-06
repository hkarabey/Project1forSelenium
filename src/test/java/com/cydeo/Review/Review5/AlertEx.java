package com.cydeo.Review.Review5;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertEx {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test_1() throws InterruptedException {
        driver.navigate().to("https://www.demoblaze.com/index.html");

        WebElement laptops =driver.findElement(By.xpath("//a[.='Laptops']"));
        laptops.click();
        WebElement sony=driver.findElement(By.xpath("//a[.='Sony vaio i5']"));
        sony.click();
        WebElement cart=driver.findElement(By.xpath("//a[.='Add to cart']"));
        cart.click();
       Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

    }

}
