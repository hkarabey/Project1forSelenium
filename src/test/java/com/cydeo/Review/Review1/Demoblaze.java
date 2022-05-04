package com.cydeo.Review.Review1;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.transform.sax.SAXResult;

public class Demoblaze {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoblaze.com/index.html");

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        String expectedTitle = "STORE";
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

    }


}


