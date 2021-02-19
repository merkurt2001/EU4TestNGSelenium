package com.cybertek.tests.Hw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hw_8 {

//    Step 1. Go to “https://practicecybertekschool.
//    herokuapp.com”
//    Step 2. And click on “Autocomplete”.
//    Step 3. Enter “United States of America” into
//    country input box.
//            Step 4. Verify that following message is displayed:
//            “You selected: United States of America”
//

    @Test
    public void test8() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Autocomplete")).click();
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        driver.findElement(By.cssSelector("[type='button']")).click();
        String actual=driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(actual);
        String expected="You selected: United States of America";
        Assert.assertEquals(actual,expected);


    }


}
