package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown ");
    }

    @Test
    public void simpleDropDownTest(){
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentSelectedOption = simpleDropDown.getFirstSelectedOption();

        String actualSDText = currentSelectedOption.getText();

        System.out.println("actualSDText = " + actualSDText);

        String expectedSDText = "Please select an option";

        //Expected: “Please select an option”
        Assert.assertEquals(actualSDText,expectedSDText);

        //4. Verify “State selection” default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
       // WebElement currentSelectedOption = simpleDropDown.getFirstSelectedOption();


        //Expected: “Select a State”
        String expectedStateDText = "Select a State";

        String actualStateDText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDText,expectedStateDText);

    }





}
