package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHW2 {
// 1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
// 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
//    a. “Home” link
//    b. “Forgot password” header
//    c. “E-mail” text
//    d. E-mail input box
//    e. “Retrieve password” button
//
//4.Print text of a,b,c,e and put some email to d

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement home=driver.findElement(By.xpath("//a[@class='nav-link']"));

        System.out.println(home.getText());

        WebElement forgotPassword=driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        System.out.println(forgotPassword.getText());

        WebElement email=driver.findElement(By.xpath("//label[@for='email']"));

        System.out.println(email.getText());

        WebElement emailInput=driver.findElement(By.xpath("//input[@name='email']"));

        emailInput.sendKeys("hatice");

        String name=emailInput.getAttribute("value");
        System.out.println("name = " + name);
        WebElement retrievePassword=driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

        System.out.println(retrievePassword.getText());

        driver.close();




    }






}
