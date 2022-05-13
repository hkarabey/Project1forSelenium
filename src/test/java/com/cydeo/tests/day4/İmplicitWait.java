package com.cydeo.tests.day4;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class İmplicitWait {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/abtest");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //alt+enter
        //option +enter
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int size = allLinks.size();
        System.out.println(size);


        for (WebElement each : allLinks) {
            System.out.println(each.getText());

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement firstLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println("firstLink.getText() = " + firstLink.getText());

        String firstValue = firstLink.getAttribute("href");
        System.out.println(firstValue);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement secondLink = driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("secondLink.getText() = " + secondLink.getText());


        String secondValue = secondLink.getAttribute("href");

        for (WebElement allLink : allLinks) {
            System.out.println("allLink.getAttribute(\"href\") = " + allLink.getAttribute("href"));
        }


    }


}
