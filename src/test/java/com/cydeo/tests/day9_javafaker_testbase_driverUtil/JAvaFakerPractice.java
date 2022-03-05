package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JAvaFakerPractice {

    @Test
    public void test1(){

        //create faker object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        int max = faker.number().randomDigit();

        System.out.println("max = " + max);

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("202-###-####"));
        System.out.println("faker.letterify(\"???????\") = " + faker.letterify("????-???"));

        System.out.println("faker.bothify(\"###????\") = " + faker.bothify("###????"));

        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " +
                faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Check Norris\", \"Muhtar\") = " +
                faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));

    }

}
