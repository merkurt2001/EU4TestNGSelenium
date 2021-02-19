package com.cybertek.tests.Hw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
    }
    @Test(dataProvider = "TestCaseProvider")
    public void testCase9To12(String statusCode, String message) {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText(statusCode)).click();
        String actual=driver.findElement(By.tagName("p")).getText();
        Assert.assertTrue(actual.contains(message));
        driver.quit();
    }
    @DataProvider(name="TestCaseProvider")
    public Object [][] statusCheck(){
        Object [][] statusData = new Object[4][2];
        statusData[0][0]="200";
        statusData[0][1]="This page returned a 200 status code.";
        statusData[1][0]="301";
        statusData[1][1]="This page returned a 301 status code.";
        statusData[2][0]="404";
        statusData[2][1]="This page returned a 404 status code.";
        statusData[3][0]="500";
        statusData[3][1]="This page returned a 500 status code.";
        return statusData;
    }
}
