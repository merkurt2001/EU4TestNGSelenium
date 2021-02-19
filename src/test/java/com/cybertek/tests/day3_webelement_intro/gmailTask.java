package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailTask {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[1]/div/label/input")).sendKeys("dkfjskdjf");



//        driver.findElement(By.xpath("//*[@id=\'userKvkkModal\']/div/div[2]/span")).click();
//        Thread.sleep(7000);
//        driver.findElement(By.xpath("//*[@id=\'dengage-push-perm-slide\']/div/div[2]/div/button[1]")).click();
//
//        driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/div[2]/div[2]/div/div/a[1]")).click();
//        driver.findElement(By.id("email")).sendKeys("herkurt2001@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("he");
//        Thread.sleep(3000);
//        driver.findElement(By.id("loginButton")).click();

//        driver.navigate().to("https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F");
//        driver.findElement(By.id("login-email")).sendKeys("herkurt2001@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.id("login-password-input")).sendKeys("he460");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\'login-register\']/div[3]/div[1]/form/button")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\'browsing-gw-homepage\']/div/div[2]/div[1]/div[1]/article[1]/a/span/img")).click();
//        driver.findElement(By.xpath("//*[@id=\'search-app\']/div/div/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/div/img")).click();
//

    }
}
