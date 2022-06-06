package com.cydeo.tests.day10_jsexecuter;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecuter {

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("url_executer"));

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,0)");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,750)");
        }
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-750)");
        }


    }



}
