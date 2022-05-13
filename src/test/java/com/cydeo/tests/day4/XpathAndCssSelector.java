package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCssSelector {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com/forgot_password");
        WebElement homePage =driver.findElement(By.cssSelector("a[class='nav-link']"));
    WebElement header=driver.findElement(By.cssSelector("div[class='example']>h2"));

        System.out.println(header.getText());

        WebElement emaillink=driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(emaillink.getText());

        WebElement inputbox=driver.findElement(By.xpath("//input[@type='text']"));
        inputbox.sendKeys("ali");
        WebElement inputNAME=driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputPattern=driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));

        WebElement inputConn=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        WebElement inputConn2=driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        WebElement inputConn3= driver.findElement(By.xpath("//input[contains(@pattern,'[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$')]"));


        WebElement retriveButton= driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement powerd= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        WebElement powerd2= driver.findElement(By.xpath("//a[@target='_blank']"));
        WebElement cydeoLink= driver.findElement(By.xpath("//a[@target='_blank']"));


        System.out.println("homePage.isDisplayed() = " + homePage.isDisplayed());
        System.out.println("header.isDisplayed() = " + header.isDisplayed());
        System.out.println("emaillink.isDisplayed() = " + emaillink.isDisplayed());
        System.out.println("inputbox.isDisplayed() = " + inputbox.isDisplayed());
        System.out.println("inputNAME.isDisplayed() = " + inputNAME.isDisplayed());
        System.out.println("inputPattern.isDisplayed() = " + inputPattern.isDisplayed());
        System.out.println("inputConn.isDisplayed() = " + inputConn.isDisplayed());
        System.out.println("inputConn2.isDisplayed() = " + inputConn2.isDisplayed());
        System.out.println("inputConn3.isDisplayed() = " + inputConn3.isDisplayed());
        System.out.println("retriveButton.isDisplayed() = " + retriveButton.isDisplayed());
        System.out.println("powerd.isDisplayed() = " + powerd.isDisplayed());
        System.out.println("powerd2.isDisplayed() = " + powerd2.isDisplayed());
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


    }


}
