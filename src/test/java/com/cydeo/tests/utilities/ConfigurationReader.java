package com.cydeo.tests.utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {

        try {

            FileInputStream file = new FileInputStream("configuration.properties");


            properties.load(file);

            file.close();

        } catch (IOException e) {
            System.out.println("file not found the configurationReader class");
            e.printStackTrace();
        }

    }

public static String getProperty(String keyword){

        return properties.getProperty(keyword);


}

}
