package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4__cssSelector_getText {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        String expectedPasswordReset = "Reset password";

        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String actualPasswordText = resetPassword.getAttribute("value");

        System.out.println("actualPasswordText = " + actualPasswordText);

        if (actualPasswordText.equals(expectedPasswordReset)){
            System.out.println("Actual forgot my password equal the expected, test pass");
        }else
            System.out.println("Actual forgot my password does not equal the expected, test failed");


        // <button class="login-btn" value="Reset password" onclick="BX.addClass(this, 'wait');">Reset password</button>



        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from


    }
}
