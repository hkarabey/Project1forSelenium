package com.cydeo.tests.day3;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTextGetAttribute2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");

         WebElement resetButtonLink=driver.findElement(By.cssSelector("button[class='login-btn']"));

        String actualResetButton= resetButtonLink.getText();
        String expectedResetButton="Reset password";

        if (expectedResetButton.equals(actualResetButton)){
            System.out.println("reset button test passed");
        }else{
            System.out.println("reset button test failed");
        }


    }



}
