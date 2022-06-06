package com.cydeo.tests.day9_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JvaFakerPractice {

    @Test
    public void test1(){

        Faker faker=new Faker();
        //Faker faker =new Faker(new Locale("fr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(5525682543) = " + faker.numerify("552-568-2543"));

        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));

        System.out.println("faker.letterify(\"??-???\") = " + faker.letterify("??-???"));

        System.out.println("faker.bothify(\"??-###??-##\") = " + faker.bothify("??-###??-##"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.finance().creditCard().replace(\"-\",\"\") = " + faker.finance().creditCard().replace("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replace("Chuck Norris","Halil"));

    }



}
