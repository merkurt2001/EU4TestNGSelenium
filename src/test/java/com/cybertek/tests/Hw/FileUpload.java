package com.cybertek.tests.Hw;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload {
    //    Step 1. Go to “https://practicecybertekschool.
//    herokuapp.com”
//    Step 2. And click on “File Upload".
//    Step 3. Upload any file with .txt extension from your
//    computer.
//            Step 4. Click “Upload” button.
//            Step 5. Verify that subject is: “File Uploaded!”
//    Step 6. Verify that uploaded file name is displayed.
    @Test
    public void test7() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='File Upload']")).click();


        WebElement chooseFile = driver.findElement(By.name("file"));
        //sending file with sendKeys method
        chooseFile.sendKeys("C:\\Users\\me\\Desktop\\file.txt.docx");
        //clicking upload button
        driver.findElement(By.id("file-submit")).click();

        //getting the file name from browser
        String actualFileName= driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is file.txt
        Assert.assertEquals(actualFileName,"file.txt.docx");

    }
}
