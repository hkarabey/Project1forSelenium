package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");


/*
        WebElement apple= driver.findElement(By.name("apple"));

        Thread.sleep(3000);
        apple.click();
*/


        WebElement googleSerchBox = driver.findElement(By.name("q"));

        googleSerchBox.sendKeys("apple");
        Thread.sleep(3000);

        WebElement click= driver.findElement(By.name("btnK"));

        click.click();
        /*
        googleSerchBox.sendKeys("apple"+Keys.ENTER);
        */


        String expectedTitle= driver.getTitle();

        String actualTitle=driver.getTitle();

        System.out.println(driver.getTitle());

        if (expectedTitle.startsWith("apple")){
            System.out.println("it is passed");
        }else {
            System.out.println("it is failed");
        }



    }


}
