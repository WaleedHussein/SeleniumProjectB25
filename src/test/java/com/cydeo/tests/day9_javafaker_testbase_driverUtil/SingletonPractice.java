package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singletontest1(){

        String str = Singleton.getWord();
        System.out.println("str = " + str);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str);

    }
}
