package com.github.curriculeon;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.apache.coyote.http11.Constants.a;

public class DemoApplicationTest_Broken {


    @Test
    public void test_sign_up() {
        // Use WebDriverManager to manage ChromeDriver
        WebDriverManager.firefoxdriver().setup();

        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();

        {

            // Navigate to the web page
            driver.get("https://automationexercise.com/");

            // click the sign up/ login button
            driver.findElement(By.cssSelector("a[href*='/login']")).click();

            String actual_url = driver.getCurrentUrl();
            String expected_url = "https://automationexercise.com/login";
            Assert.assertEquals(expected_url,actual_url);

            //click the name with the driver
            WebElement nameField = driver.findElement(By.cssSelector("input[data-qa*='signup-name']"));

            //Generate Random Name
            String randomName = RandomStringUtils.randomAlphabetic(10);
            nameField.sendKeys(randomName);

            //Make driver click email address box
            WebElement emailField = driver.findElement(By.cssSelector("input[data-qa*='signup-email']"));

            //Make driver click Email Address field
            emailField.sendKeys(randomName + "@TestEmail.com");

            //Make driver click sign up button
            driver.findElement(By.cssSelector("button[data-qa*='signup-button']")).click();

            String actual_url1 = driver.getCurrentUrl();
            String expected_url1 = "https://automationexercise.com/signup";
            Assert.assertEquals(expected_url1,actual_url1);

            //Make driver click password button
            //g driver.findElement(By.cssSelector())



            // click the sign up for news letter checkbox
            //     driver.findElement(By)


            //  driver.quit();

        }

    }


}


