package com.cydeo.tests.day10_jsexecuter;

import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsHover {


@Test

    public void test() throws InterruptedException {

    Driver.getDriver().get("https://practice.cydeo.com/hovers ");

    WebElement img1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));

    WebElement writen1=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
    

   Actions actions=new Actions(Driver.getDriver());

   actions.moveToElement(img1).perform();
    Assert.assertTrue(writen1.isDisplayed());
    Thread.sleep(2000);


    WebElement img2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
   WebElement writen2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
   actions.moveToElement(img2).perform();
   Assert.assertTrue(writen2.isDisplayed());
Thread.sleep(2000);


   WebElement img3=Driver.getDriver().findElement(By.xpath("(//img)[3]"));
    WebElement writen3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
actions.moveToElement(img3).perform();
Assert.assertTrue(writen3.isDisplayed());




}


}
