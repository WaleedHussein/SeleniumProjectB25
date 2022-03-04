package com.cydeo.tests.day8_Properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {


    @Test
    public void JavaPropertiesReadingTest(){
        System.out.println("System.getProperties(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperties(\"user.name\") = " + System.getProperty("user.name"));
    }

}
