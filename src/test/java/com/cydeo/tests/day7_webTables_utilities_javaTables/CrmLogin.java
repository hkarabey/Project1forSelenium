package com.cydeo.tests.day7_webTables_utilities_javaTables;

import com.cydeo.tests.base.TestBase;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrmLogin extends TestBase {





    @Test
    public void test() {
        driver.navigate().to("https://login.nextbasecrm.com/");
        //helpdesk1@cybertekschool.com

        WebElement userName=driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys("helpdesk1@cybertekschool.com");
        //Thread.sleep(2000);
        WebElement password= driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("UserUser");
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();


        String currentTitle=driver.getTitle();
        System.out.println(currentTitle);
        Assert.assertTrue(currentTitle.contains("Portal"));


    }
}
