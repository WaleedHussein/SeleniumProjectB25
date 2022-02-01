package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //#1 setting up web driver manager
        WebDriverManager.chromedriver().setup();

        //#2 create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //#3 test of driver is working as expected
        driver.get("https://www.google.com");


//        to comment specfice lines, highlight then hit ctrl /





    }

}
