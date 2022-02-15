package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

    //TC #4: FindElements Task
        WebDriver driver =  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //providing extra time for our driver before it throws nosuchelementexception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

    //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
    //4- Print out the number of the links on the page.
        System.out.println("allLinks.size = " + allLinks.size());
        //5- Print out the texts of the links.
        for (WebElement each : allLinks){
            System.out.println("Text of links: " + each.getText());
            System.out.println("HREF Values: " + each.getAttribute("href")); //#6
        }

    //6- Print out the HREF attribute values of the links


    }
}
