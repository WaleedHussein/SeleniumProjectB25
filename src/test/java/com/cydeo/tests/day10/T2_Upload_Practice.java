package com.cydeo.tests.day10;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void uploadTest(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");
        WebElement upload = Driver.getDriver().findElement(By.id("file-upload"));
        String filepath= "C:\\Users\\walee\\Desktop\\firsttask1.jpg";
        upload.sendKeys(filepath);

        WebElement submit = Driver.getDriver().findElement(By.id("file-submit"));
        submit.click();
    }



}
