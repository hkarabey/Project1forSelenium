package com.cydeo.tests.day9_javaFaker;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if (word==null){
            System.out.println("first time call. Word is null assiging value to it now");

            word="something";

        }
        else {
            System.out.println("Word already has value");
        }

        return word;
    }



}
