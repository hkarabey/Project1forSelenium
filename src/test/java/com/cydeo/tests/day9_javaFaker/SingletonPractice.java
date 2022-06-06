package com.cydeo.tests.day9_javaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test(priority = 2)

    public void singleton_understand_1(){

        String s1=Singleton.getWord();
        System.out.println("s1 = " + s1);

        String s2=Singleton.getWord();
        System.out.println("s2 = " + s2);

        String s3=Singleton.getWord();
        System.out.println("s3 = " + s3);


    }
@Test(priority = 1)
    public void singleton_understand_2(){
        String s4=Singleton.getWord();
    System.out.println("s4 = " + s4);
}

}
