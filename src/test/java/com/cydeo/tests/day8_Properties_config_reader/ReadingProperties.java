package com.cydeo.tests.day8_Properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {

        //1- create the object of properties
        Properties properties = new Properties();

        //2- we need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- load the properties object using fileinputstream
        properties.load(file);

        //4- use properties object to read values
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("username"));


    }
}
