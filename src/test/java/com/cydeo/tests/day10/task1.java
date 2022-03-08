package com.cydeo.tests.day10;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 {

    @Test
    public void test(){

        Faker faker = new Faker();

       // Driver.getDriver().get("https://practice.cydeo.com/registration_form");
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        WebElement firstName = Driver.getDriver().findElement(By.cssSelector("input[placeholder = 'first name']"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = Driver.getDriver().findElement(By.cssSelector("input[placeholder = 'last name']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement username = Driver.getDriver().findElement(By.cssSelector("input[placeholder = 'username']"));
        username.sendKeys(faker.letterify("??????????"));

        WebElement email = Driver.getDriver().findElement(By.cssSelector("input[placeholder = 'email@email.com']"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement password = Driver.getDriver().findElement(By.cssSelector("input[name = 'password']"));
        password.sendKeys(faker.internet().password());

        WebElement phone = Driver.getDriver().findElement(By.cssSelector("input[name = 'phone']"));
        phone.sendKeys(faker.phoneNumber().cellPhone());

        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        gender.click();

        WebElement birthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
//        birthday.sendKeys(faker.numerify("##/##/####"));
       // birthday.sendKeys(faker.numerify("12/22/1990"));
        birthday.sendKeys("12/22/1990");

        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByValue("DE");

        Select jobtitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobtitle.selectByVisibleText("SDET");

        WebElement language = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        language.click();

        WebElement signup = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));

        signup.click();

        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']/p"));

        String expectedMsg = "You've successfully completed registration!";
        String actualmsg = message.getText();
        System.out.println("actualmsg = " + actualmsg);

        Assert.assertEquals(actualmsg,expectedMsg);

    }

}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.
Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
 */