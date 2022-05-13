package com.cydeo.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;
import java.util.Set;

public class GetTextGetAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com/");

        WebElement remember=driver.findElement(By.className("login-item-checkbox-label"));
        String rememberMe=remember.getText();
        System.out.println(rememberMe);

        if (rememberMe.equals("Remember me on this computer")){
            System.out.println("remember me Text PASSED");
        }else {
            System.out.println("remember me Text is FAİLED");
        }
        System.out.println("-----------");

        WebElement forgetPassword=driver.findElement(By.className("log-popup-footer"));

        String forgetPasswordText=forgetPassword.getText();
        System.out.println(forgetPasswordText);

        if (forgetPasswordText.equals("FORGOT YOUR PASSWORD?")) {
            System.out.println("forgetPassword PASSED");
        }else {
            System.out.println("forgetPassword failed");
        }

        System.out.println("-----------");

       WebElement getAttribute=driver.findElement(By.className("login-link-forgot-pass"));
       String getAttributeActual= getAttribute.getAttribute("href");
        System.out.println(getAttributeActual);



    }



}
