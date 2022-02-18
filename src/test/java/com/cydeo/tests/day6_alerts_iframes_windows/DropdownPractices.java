package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class DropdownPractices {

        public WebDriver driver;

        @BeforeMethod
        public void setupMethod(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://practice.cydeo.com/dropdown");
        }



        @Test
        public void dropdown_task5() throws InterruptedException {
            //TC #5: Selecting state from State dropdown and verifying result 1. Open Chrome browser
            //2. Go to https://practice.cydeo.com/dropdown


            //we located the dropdown and it is ready to use
            Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

            //3. Select Illinois
            Thread.sleep(1000);
            stateDropdown.selectByVisibleText("Illinois");

            //4. Select Virginia
            Thread.sleep(1000);
            stateDropdown.selectByValue("VA");

            //5. Select California
             stateDropdown.selectByIndex(5);

            //6. Verify final selected option is California.
            String expectedOptionCali = "California";
            String actualOptionCali = stateDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(actualOptionCali,expectedOptionCali);



        }

        @Test
        public void dropdown_task6(){
            //3. Select “December 1st, 1923” and verify it is selected.
            //Select year using  : visible text
            //Select month using   : value attribute
            //Select day using : index number
              Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
              Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
              Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

              yearDropdown.selectByVisibleText("1923");
              monthDropdown.selectByValue("11");
              dayDropdown.selectByIndex(0);

              String expectedyear = "1923";
              String expectedmonth = "December";
              String expectedday = "1";

              String actualYear = yearDropdown.getFirstSelectedOption().getText();
              String actualMonth = monthDropdown.getFirstSelectedOption().getText();
              String actualDay= dayDropdown.getFirstSelectedOption().getText();

              Assert.assertTrue(actualDay.equals(expectedday));
              Assert.assertEquals(actualYear,expectedyear);
              Assert.assertEquals(actualMonth,expectedmonth);
        }

        @AfterMethod
        public void teardownMethod(){
            driver.close();
        }

    }

