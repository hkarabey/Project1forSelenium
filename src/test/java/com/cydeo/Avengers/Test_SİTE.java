package com.cydeo.Avengers;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.PackageUtils;

import java.util.concurrent.TimeUnit;

public class Test_SİTE {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() {

    }

    @Test
    public void test() {
        driver.navigate().to("https://www.automationexercise.com/");
        String actualwebTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";


        Assert.assertEquals(actualwebTitle, expectedTitle);

WebElement testCse=driver.findElement(By.xpath("(//button[.='Test Cases'])[1]"));
testCse.click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement signlink=driver.findElement(By.partialLinkText("Signup"));
signlink.click();




    }


}
