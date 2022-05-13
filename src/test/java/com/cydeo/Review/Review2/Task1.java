package com.cydeo.Review.Review2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    Verify confirmation message
        open chrome browser
        go to https://practice.cydeo.com/forgot_password
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com/forgot_password");
        WebElement email =driver.findElement(By.name("email"));

        email.sendKeys("halil@gmail.com");
        //boolean isDisplayed= email.isDisplayed();
        Thread.sleep(3000);

        WebElement retriveTab=driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        retriveTab.click();

        WebElement afterClick= driver.findElement(By.name("confirmation_message"));
        String actualResult=afterClick.getText();
        String expectedResult="Your e-mail's been sent!";



    }


}
