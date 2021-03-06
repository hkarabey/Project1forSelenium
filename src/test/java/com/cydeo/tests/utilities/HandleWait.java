package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleWait {

    public static void staticWait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){

        }
    }

    // will be used in demoblaze application, to navigate to different links at the page
    // will click on different elements/links at the page
    public static void getLink(WebDriver driver, String link) {
        driver.findElement(By.partialLinkText(link)).click();
        staticWait(1);
    }
}
