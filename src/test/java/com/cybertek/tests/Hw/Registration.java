package com.cybertek.tests.Hw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {

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

//        Step 1. Go to “https://practicecybertekschool.
//        herokuapp.com”
//        Step 2. Click on “Registration Form”
//        Step 3. Enter “wrong_dob” into date of birth input
//        box.
//                Step 4. Verify that warning message is displayed:
//        “The date of birth is not valid”
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("(//*[.='Registration Form'])[2]")).click();
        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");
        WebElement notValid = driver.findElement(By.xpath("//*[.='The date of birth is not valid']"));

        Assert.assertTrue(notValid.isDisplayed());

    }
    @Test
    public void test2() {

//        Step 1. Go to “https://practicecybertekschool.
//        herokuapp.com”
//        Step 2. Click on “Registration Form”
//        Step 3. Verify that following options for
//        programming languages are displayed: c++, java,
//                JavaScript

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("(//*[.='Registration Form'])[2]")).click();

        WebElement cPlus=driver.findElement(By.cssSelector("[value='cplusplus']"));
        WebElement java=driver.findElement(By.cssSelector("[value='java']"));
        WebElement javaScript=driver.findElement(By.cssSelector("[value='javascript']"));

        Assert.assertTrue(cPlus.isDisplayed()&&java.isDisplayed()&& javaScript.isDisplayed());

    }
    @Test
    public void test3() {

//        Step 1. Go to “https://practicecybertekschool.
//        herokuapp.com”
//        Step 2. Click on “Registration Form”
//        Step 3. Enter only one alphabetic character into first
//        name input box.
//                Step 4. Verify that warning message is displayed:
//“first name must be more than 2 and less than 64
//        characters long”

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("(//*[.='Registration Form'])[2]")).click();

        driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("a");
        WebElement warning=driver.findElement(By.xpath("//*[contains(text(),'more than 2')]"));


        Assert.assertTrue(warning.isDisplayed());

    }

    @Test
    public void test4() {

//        Step 1. Go to https://practicecybertekschool.
//        herokuapp.com
//        Step 2. Click on “Registration Form”
//        Step 3. Enter only one alphabetic character into last
//        name input box.
//                Step 4. Verify that warning message is displayed:
//“The last name must be more than 2 and less than
//        64 characters long”

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("(//*[.='Registration Form'])[2]")).click();

        driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("a");
        WebElement warning=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[2]"));


        Assert.assertTrue(warning.isDisplayed());

    }

    @Test
    public void test5() {

///Step 1. Go to “https://practicecybertekschool.
//        herokuapp.com”
//        Step 2. Click on “Registration Form”
//        Step 3. Enter any valid first name.
//                Step 4. Enter any valid last name.
//                Step 5. Enter any valid user name.
//                Step 6. Enter any valid password.
//        Step 7. Enter any valid phone number.
//                Step 8. Select gender.
//        Step 9. Enter any valid date of birth.
//        Step 10. Select any department.
//                Step 11. Enter any job title.
//        Step 12. Select java as a programming language.
//        Step 13. Click Sign up.
//                Step 14. Verify that following success message is
//        displayed: “You've successfully completed
//        registration!”

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("(//*[.='Registration Form'])[2]")).click();

        WebElement dropdownElement1 = driver.findElement(By.name("department"));
        Select departmentDropdown = new Select(dropdownElement1);
        WebElement dropdownElement2 = driver.findElement(By.name("job_title"));
        Select jobDropdown = new Select(dropdownElement2);

        driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Mike");
        driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Smith");
        driver.findElement(By.cssSelector("[name='username']")).sendKeys("MSimith");
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("mssimith@google.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("aaaaaaaa");
        driver.findElement(By.cssSelector("[name='phone']")).sendKeys("571-000-0000");
        driver.findElement(By.cssSelector("[value='male']")).click();
        driver.findElement(By.cssSelector("[name='birthday']")).sendKeys("10/11/2010");
        departmentDropdown.selectByVisibleText("Department of Engineering");
        jobDropdown.selectByVisibleText("Developer");

        driver.findElement(By.cssSelector("[value='java']")).click();
        driver.findElement(By.cssSelector("#wooden_spoon")).click();

        WebElement success= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));

        Assert.assertTrue(success.isDisplayed());








    }
}
