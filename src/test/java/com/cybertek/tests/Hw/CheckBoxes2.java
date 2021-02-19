package com.cybertek.tests.Hw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxes2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("CHROME");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


    @Test
    public void test1() {
//        1. Open Chrome browser
//        2. Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
//        3. Verify “Check All” button text is “Check All”
//        4. Click to “Check All” button
//        5. Verify all check boxes are checked
//        6. Verify button text changed to “Uncheck All”
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.cssSelector("[value='Check All']"));

        System.out.println("checkAll.getAttribute() = " + checkAll.getAttribute("value"));

        checkAll.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("(//input[@class='cb1-element'])"));
        int i = 1;
        for (WebElement checkBox : checkBoxes) {
            if (checkBox.isSelected()) {
                System.out.println("Option " + i + " is selected");
            } else if (!checkBox.isSelected()) {
                System.out.println("Option " + i + " is not selected");
            }

            i++;

        }


        System.out.println("checkAll.getAttribute() = " + checkAll.getAttribute("value"));
    }


}
