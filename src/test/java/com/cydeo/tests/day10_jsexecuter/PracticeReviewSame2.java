package com.cydeo.tests.day10_jsexecuter;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeReviewSame2 {

    @Test (priority = 1)
    public void test1() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("reistration_form_url"));
        Faker faker=new Faker();


            WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));

            firstName.sendKeys(faker.name().firstName());
            Thread.sleep(2000);

            WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));

            lastName.sendKeys(faker.name().lastName());
            Thread.sleep(2000);
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.bothify("###???")+"@email.com");

        Thread.sleep(2000);
        WebElement username=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
    username.sendKeys(faker.bothify("???####??"));

        Thread.sleep(2000);
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        Thread.sleep(2000);


        WebElement phone=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("123-456-6789");
        Thread.sleep(2000);

        WebElement male=Driver.getDriver().findElement(By.xpath("//input[@value='male']"));

        male.click();

        WebElement year=Driver.getDriver().findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        year.sendKeys("12/11/2011");

        Thread.sleep(2000);

        Select select=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        select.selectByVisibleText("Department of Engineering");
        Thread.sleep(2000);

        select=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        select.selectByIndex(faker.number().numberBetween(2,9));

        WebElement box2=Driver.getDriver().findElement(By.cssSelector("input[id='inlineCheckbox2']"));
        box2.click();
        Thread.sleep(2000);

        WebElement signUp=Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        signUp.click();



    }


}
