package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class anime {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.get("https://practice.cydeo.com/iframe");
        driver.get("https://myanimelist.net/");

    }

    @Test
    public void anime(){

        WebElement search = driver.findElement(By.xpath("//input[@id='topSearchText']"));
        System.out.println("search.getText() = " + search.getAttribute("id"));

    }

}
