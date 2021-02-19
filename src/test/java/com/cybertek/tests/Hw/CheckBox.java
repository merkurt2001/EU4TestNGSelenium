package com.cybertek.tests.Hw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBox {

    WebDriver driver;

   @BeforeMethod
   public void setUp(){
       driver= WebDriverFactory.getDriver("CHROME");
   }

   @AfterMethod
   public void tearDown() throws InterruptedException {
       Thread.sleep(2000);
       driver.close();
   }

    @Test
    public void test1(){
//        1. Open Chrome browser
//        2. Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
//        3. Verify “Success – Check box is checked” message is NOT displayed.
//        4. Click to checkbox under “Single Checkbox Demo” section
//        5. Verify “Success – Check box is checked” message is displayed.

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkBox= driver.findElement(By.cssSelector("input#isAgeSelected"));
        WebElement successMessage= driver.findElement(By.cssSelector("div#txtAge"));

        System.out.println("successMessage.isDisplayed() = " + successMessage.isDisplayed());
        Assert.assertFalse(successMessage.isDisplayed(),"Check box is checked");

        checkBox.click();

        System.out.println("successMessage.isDisplayed() = " + successMessage.isDisplayed());
        Assert.assertTrue(successMessage.isDisplayed(),"Check box is not checked");


    }

    @Test
    public void test2(){
//        1. Open Chrome browser
//        2. Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
//        3. Verify “Check All” button text is “Check All”
//        4. Click to “Check All” button
//        5. Verify all check boxes are checked
//        6. Verify button text changed to “Uncheck All”
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAll= driver.findElement(By.cssSelector("[value='Check All']"));

        System.out.println("checkAll.getAttribute() = " + checkAll.getAttribute("value"));

        checkAll.click();

        for (int i=1; i <= 4; i++) {
            String xpathLocator="(//input[@class='cb1-element'])"+"["+i+"]";
            WebElement checkBox= driver.findElement(By.xpath(xpathLocator));
            Assert.assertTrue(checkBox.isSelected());
            System.out.println("Option "+i+" "+checkBox.isSelected());

        }

        System.out.println("checkAll.getAttribute() = " + checkAll.getAttribute("value"));
    }


}
