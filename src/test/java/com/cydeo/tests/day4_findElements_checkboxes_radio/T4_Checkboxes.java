package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_Checkboxes {
    public static void main(String[] args) {

        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //4. Click checkbox #1 to select it.
        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        //5. Click checkbox #2 to deselect it.
        checkbox2.click();
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.

driver.close();


    }
}
