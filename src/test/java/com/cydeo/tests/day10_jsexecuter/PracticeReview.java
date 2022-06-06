package com.cydeo.tests.day10_jsexecuter;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.channels.WritableByteChannel;
import java.util.concurrent.TimeUnit;

public class PracticeReview {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://practice.cydeo.com/registration_form");
        WebElement name =driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("halil");
        Thread.sleep(2000);
        WebElement lastNmae=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNmae.sendKeys("karabey");
        Thread.sleep(2000);
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("karabey@gmail.com");

        Thread.sleep(2000);
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("hal123");

        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("12qw3412");
        Thread.sleep(2000);
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("123-456-6789");
        Thread.sleep(2000);

        WebElement male=driver.findElement(By.xpath("//input[@value='male']"));

        male.click();

        WebElement year=driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        year.sendKeys("12/11/2011");

        Thread.sleep(2000);

        Select select=new Select(driver.findElement(By.xpath("//select[@name='department']")));
        select.selectByVisibleText("Department of Engineering");
        Thread.sleep(2000);

        select=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        select.selectByVisibleText("SDET");

        WebElement box2=driver.findElement(By.cssSelector("input[id='inlineCheckbox2']"));
        box2.click();
        Thread.sleep(2000);

        WebElement signUp=driver.findElement(By.xpath("//button[.='Sign up']"));
        signUp.click();

    }



}
