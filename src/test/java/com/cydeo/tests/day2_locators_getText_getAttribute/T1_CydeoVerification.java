package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("Https://www.google.com");

        driver.navigate().to("https://practice.cydeo.com");

        String expectedURL = "cydeo";

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedURL))
            System.out.println("url pass");

        else System.out.println("url failed");

        String expectedTitle = "practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("title verification pass");
        else System.out.println("title verification failed");


       // driver.close();


    }
}
