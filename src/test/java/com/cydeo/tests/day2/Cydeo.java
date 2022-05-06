package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://cydeo.com/programs/");

        if (driver.getTitle().contains("Program")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        String expectedURL="cydeo";
        String actualURL= driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.close();


    }

}
