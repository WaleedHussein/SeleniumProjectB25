package com.cydeo.tests.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {

//TC #6: StaleElementReferenceException Task
//1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

//3- Locate “CYDEO” link, verify it is displayed.

        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

//4- Refresh the page.
        driver.navigate().refresh();

        //we are refreshing welelement reference by reassigning
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));


//5- Verify it is displayed, again.
//This is a simple StaleElementReferenceException to understand what is
//this exception and how to handle it.


        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

    }
}
