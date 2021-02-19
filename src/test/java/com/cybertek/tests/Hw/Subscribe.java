package com.cybertek.tests.Hw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Subscribe {

//    Step 1. Go to "https://www.tempmailaddress.com/"
//    Step 2. Copy and save email as a string.
//            Step 3. Then go to “https://practicecybertekschool.herokuapp.com”
//    Step 4. And click on “Sign Up For Mailing List".
//    Step 5. Enter any valid name.
//    Step 6. Enter email from the Step 2.
//    Step 7. Click Sign Up
//    Step 8. Verify that following message is displayed:
//            “Thank you for signing up. Click the button below to
//return to the home page.”
//    Step 9. Navigate back to the “https://
//    www.tempmailaddress.com/”
//    Step 10. Verify that you’ve received an email from
//“do-not-reply@practice.cybertekschool.com”
//    Step 11. Click on that email to open it.
//            Step 12. Verify that email is from: “do-notreply@
//            practice.cybertekschool.com”
//    Step 13. Verify that subject is: “Thanks for
//    subscribing to practice.cybertekschool.com!”

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
    }
    @Test
    public void testCase6() throws InterruptedException {
        driver.get("https://www.fakemail.net/");
        String email=driver.findElement(By.cssSelector(".animace")).getText();
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        WebElement signUp=driver.findElement(By.linkText("Sign Up For Mailing List"));

        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",signUp);
        signUp.click();

        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("Mike Smith");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

        driver.findElement(By.xpath("//button[@name='wooden_spoon']")).click();


        String expectedText="Thank you for signing up. Click the button below to return to the home page.";
        String actualText= driver.findElement(By.xpath("//*[@name='signup_message']")).getText();
        System.out.println(expectedText);
        System.out.println(actualText);
        Assert.assertEquals(actualText,expectedText);

        driver.get("https://www.fakemail.net/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody[@id='schranka'][1]")).click();

        String expected="do-not-reply@practice.cybertekschool.com";
        String actual=  driver.findElement(By.cssSelector("#odesilatel")).getText();
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
        String expectedSubject="Thanks for subscribing to practice.cybertekschool.com!";
        String actualSubject=  driver.findElement(By.cssSelector("#predmet")).getText();
        System.out.println(expectedSubject);
        System.out.println(actualSubject);
        Assert.assertEquals(actualSubject,expectedSubject);
    }
}


