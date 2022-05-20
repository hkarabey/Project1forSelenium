package com.cydeo.tests.day5_test_NG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("------before class running-------");
    }
    @AfterClass
    public void tearDownMethod(){
        System.out.println("-----afterClass method running------");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("before method is running");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("after method is running");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("test1 is running");

        //assert equals
        String actual="apple";
        String expected="apple";

        Assert.assertEquals(actual,expected);
        Assert.assertEquals(1,2);


    }


    @Test(priority = 2)
    public void test2(){
        System.out.println("test2 is running");

        //assert true
        String actual="apple";
        String expected="apple";

        Assert.assertTrue(actual.equals(expected));

    }



}
