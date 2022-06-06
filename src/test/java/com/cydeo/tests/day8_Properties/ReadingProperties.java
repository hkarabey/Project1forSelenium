package com.cydeo.tests.day8_Properties;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test

    public void reading_properties_test() throws IOException {

        //create the object of Properties Class

        Properties properties=new Properties();

        //FileInputStream

        FileInputStream file=new FileInputStream("configuration.properties");

        //file object load

        properties.load(file);

        //value passing key

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));


    }

}
