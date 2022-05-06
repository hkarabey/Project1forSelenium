package com.cydeo.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");

        WebElement input = driver.findElement(By.name("USER_LOGIN"));
        input.sendKeys("incorrect");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.className("login-btn"));
        login.click();
        Thread.sleep(2000);

        WebElement errorText=driver.findElement(By.className("errortext"));
        String errTe=errorText.getText();

        if (errTe.equals("Incorrect login or password")){
            System.out.println("Trying to enter as wrongly that is true ");
        }else {
            System.out.println("Trying to enter as wrongly that is false");
        }

        driver.navigate().back();



    }


}
