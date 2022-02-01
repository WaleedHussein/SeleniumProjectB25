package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium webdriver
        //this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //3- go to tesla.com
        driver.get("https://www.tesla.com");

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use seleinum to navigate back
        driver.navigate().back();










    }
}
