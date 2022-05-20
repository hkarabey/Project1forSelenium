package com.cydeo.tests.day6_alerts_ıframe;

import com.cydeo.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowsPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
       driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/windows");


    }

    @Test
    public void test1() {

        String maninHandle=driver.getWindowHandle();
        System.out.println("maninHandle = " + maninHandle);

        String beforeClickcurrentTıtle = driver.getTitle();
        System.out.println("currentTıtle = " + beforeClickcurrentTıtle);

        String expectedTıtle = "Windows";
        Assert.assertTrue(beforeClickcurrentTıtle.equals(expectedTıtle));

        WebElement clickHre=driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHre.click();

        String  actualTitleAfterClick=driver.getTitle();
        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);

        for (String each:driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("current title "+driver.getTitle());
        }

        String expectedtitleAfterclick="New Window";
        String actualTitleAfeterClick=driver.getTitle();

        Assert.assertTrue(expectedtitleAfterclick.equals(actualTitleAfeterClick));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
