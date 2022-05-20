package com.cydeo.tests.day6_alerts_ıframe;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.util.concurrent.TimeUnit;

public class Alerts {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void test_1() throws InterruptedException {

        WebElement firstAlert =driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        firstAlert.click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
    @Test
    public void test_2() throws InterruptedException {
        WebElement confirmButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmButton.click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.dismiss();

    }
    @Test
    public void test_3() throws InterruptedException {

        WebElement prompt =driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        prompt.click();
        Thread.sleep(2000);

        Alert alert= driver.switchTo().alert();
        alert.sendKeys("halil ne yapıyorsun");
        Thread.sleep(2000);
        alert.accept();
    }

}
