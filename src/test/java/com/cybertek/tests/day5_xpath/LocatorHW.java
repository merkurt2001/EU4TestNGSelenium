package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHW {




    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

//    Go to Ebay
        driver.get("https://www.ebay.com/");

//    enter search term
        WebElement searchButton=driver.findElement(By.xpath("//input[@id='gh-ac']"));

//    search selenium click on search button

        searchButton.sendKeys("selenium");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        WebElement result=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div/div/h1"));



//    print number of results
        System.out.println("result = " + result.getText());
        //
//    Go to wikipedia.org (Links to an external site.)
//    enter search term `selenium webdriver`
        driver.navigate().to("https://www.wikipedia.org/");

        WebElement searchResult= driver.findElement(By.xpath("//*[@name='search']"));
        searchResult.sendKeys("selenium webdriver");

//    click on search button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    click on search result `Selenium (software)`

        driver.findElement(By.xpath("//a[@title='Selenium (software)']")).click();

//    verify url ends with `Selenium_(software)'
        String url=driver.getCurrentUrl();
        String expectedUrl="https://en.wikipedia.org/wiki/Selenium_(software)";

        if (url.equals(expectedUrl)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
            System.out.println("url = " + url);
            System.out.println("expectedUrl = " + expectedUrl);

            driver.quit();
        }

    }
}
