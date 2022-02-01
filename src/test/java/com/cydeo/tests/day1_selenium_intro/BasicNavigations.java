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

        //this line will maximize the window size
        driver.manage().window().maximize();

        //3- go to tesla.com
        driver.get("https://www.tesla.com");

        //stop code execution for 3 seconds
        Thread.sleep(1000);

        //use selenium to navigate back
        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        //use selenium to refresh

        Thread.sleep(1000);

        driver.navigate().refresh();

        //use navigate.to method
        driver.navigate().to("https://www.yahoo.com");

        //get the title of the page

        String getTitle = driver.getTitle();

        System.out.println("getTitle = " + getTitle);

        //get current url using selenium

        String getCurrentUrl = driver.getCurrentUrl();

        System.out.println("getCurrentUrl = " + getCurrentUrl);

        //this command will close the currently opened browser
        driver.close();

        //this will close all opened browsers
        driver.quit();





    }
}
