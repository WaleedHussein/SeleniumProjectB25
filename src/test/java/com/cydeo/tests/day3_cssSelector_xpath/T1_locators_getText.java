package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

       WebElement logIn = driver.findElement(By.className("login-inp"));
       logIn.sendKeys("incorrect");
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");

//        WebElement logInButton = driver.findElement(By.className("login-btn"));
//        logInButton.click();

        WebElement logButton = driver.findElement(By.className("login-btn"));
        // we can use alt + enter then enter to introduce local variable suggestion
        logButton.click();

        String errorText = driver.findElement(By.className("errortext")).getText();
        System.out.println("errorText = " + errorText);

        String expectedError = "Incorrect login or password";

        if (errorText.equals(expectedError)){
            System.out.println("Verify test pass");
        }else {
            System.out.println("Verify failed");
        }

        driver.close();


    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password

PS: Inspect and decide which locator you should be using to locate web
elements.
 */