package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class moreXpath {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement dontChangeButton = driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input"));
        dontChangeButton.click();
        Thread.sleep(2000);
        String menuName = "Gift Cards";
        String xpathLocator = "//div[@id='nav-xshop']/*[.='"+menuName+"']";
        WebElement menu = driver.findElement(By.xpath(xpathLocator));
        menu.click();
    }
}

