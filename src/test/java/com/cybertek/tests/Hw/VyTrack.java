//package com.cybertek.tests.Hw;
//
//import com.cybertek.pages.CalendarEventsPage;
//import com.cybertek.pages.DashboardPage;
//import com.cybertek.pages.LoginPage;
//import com.cybertek.tests.TestBase;
//import com.cybertek.utilities.BrowserUtils;
//import com.cybertek.utilities.Driver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class VyTrack extends TestBase {
//
//    @Test
//    public void test1() {
////        1. Go to “https://qa1.vytrack.com/"
////        2. Login as a store manager
////        3. Navigate to “Activities -> Calendar Events”
////        4. Verify that page subtitle "Options" is displayed
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.loginAsStoreManager();
//
//        new DashboardPage().navigateToModule("Activities", "Calendar Events");
//
//        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
//
//        Assert.assertEquals(calendarEventsPage.options.getText(), "Options", "verify options");
//
//    }
//
//    @Test
//    public void test2() {
//        1. Go to “https://qa1.vytrack.com/"
//        2. Login as a store manager
//        3. Navigate to “Activities -> Calendar Events”
//        4. Verify that page number is equals to "1"


//        LoginPage loginPage = new LoginPage();
//
//        loginPage.loginAsStoreManager();
//
//        new DashboardPage().navigateToModule("Activities", "Calendar Events");
//        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
//
//
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//
//
//        Assert.assertEquals(calendarEventsPage.One.getAttribute("value"), "1", "verify options");
//
//    }
//
//    @Test
//    public void test3() {
////        1. Go to “https://qa1.vytrack.com/"
////        2. Login as a store manager
////        3. Navigate to “Activities -> Calendar Events”
////        4. Verify that view per page number is equals to
////        "25"
//
//
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.loginAsStoreManager();
//
//        new DashboardPage().navigateToModule("Activities", "Calendar Events");
//        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
//
//
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//
//        System.out.println(calendarEventsPage.perPage.getText());
//
//        Assert.assertEquals(calendarEventsPage.perPage.getText(), "25", "verify options");
//
//    }
//
//    @Test
//    public void test4() throws InterruptedException {
////        1. Go to “https://qa1.vytrack.com/"
////        2. Login as a store manager
////        3. Navigate to “Activities -> Calendar Events”
////        4. Verify that number of calendar events (rows in
////        the table) is equals to number of records
//
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.loginAsStoreManager();
//
//        new DashboardPage().navigateToModule("Activities", "Calendar Events");
//
//        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
//
//
//        Thread.sleep(3000);
//
//
////        Total Of 4041 Records
//        String record = driver.findElement(By.xpath("//div[@class='pagination pagination-centered']/label[3]")).getText();
//
//        String[] totalRecords = record.split(" ");
//
//        int totalRecord = Integer.parseInt(totalRecords[2]);
//
////        to take rows in the page
//        int rows = Integer.parseInt(driver.findElement(By.xpath("//button[contains(.,'25')]")).getText());
//
////        Of 162--to get the total pages minus 1
//        String pageNum = driver.findElement(By.xpath("//div[@class='pagination pagination-centered']/label[2]")).getText();
//
//        String[] split = pageNum.split(" ");
//
//        int pages = Integer.parseInt(split[1]) - 1;
//
////        to go to last page and get the rows number
//
//        driver.findElement(By.cssSelector("[type='number']")).sendKeys(split[1], Keys.ENTER);
//        Thread.sleep(5000);
//        int lastPageRows = driver.findElements(By.cssSelector("tbody>tr")).size();
//
//        System.out.println(rows);
//        System.out.println(pages);
//        System.out.println(lastPageRows);
//        System.out.println(totalRecord);
//
//        int total = pages * rows + lastPageRows;
//
//        System.out.println(total);
//
//        Assert.assertEquals(totalRecord, total);
//
//
//    }
//
//    @Test
//    public void test5() throws InterruptedException {
//
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.loginAsStoreManager();
//
//        new DashboardPage().navigateToModule("Activities", "Calendar Events");
//
//        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
//
//
//        Thread.sleep(2000);
//
//        driver.findElement(By.cssSelector("[class='btn-group']>button")).click();
//
//        List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));
//
//
//        //click 100
//        dropdownOptions.get(3).click();
////      check all
//
//
//        driver.findElement(By.xpath("//div[@class='btn-group dropdown']/button/input")).click();
//
//        //        Of 41--to get the total pages
//        String pageNum = driver.findElement(By.xpath("//div[@class='pagination pagination-centered']/label[2]")).getText();
//
//        String[] split = pageNum.split(" ");
//
//        int pages = Integer.parseInt(split[1]);
//
//        //start turning pages and check
//        for (int j = 1; j <= pages; j++) {
//            Thread.sleep(1500);
//            List<WebElement> numRows = driver.findElements(By.xpath("//table/tbody/tr"));
//            System.out.println("allRows.size() = " + numRows.size());
//            for (int i = 1; i <= numRows.size(); i++) {
//                String clickText = "//table/tbody/tr[" + i + "]/td[1]/input";
//                WebElement clickButton = driver.findElement(By.xpath(clickText));
//                Assert.assertTrue(clickButton.isSelected());
//            }
//            if (numRows.size()<100){
//                break;
//            }
//            driver.findElement(By.cssSelector(".fa-chevron-right.hide-text")).click();
//
//        }
//    }
//
//    @Test
//    public void test6() throws InterruptedException {
//
//        extentLogger = report.createTest("Tester event Verification");
//
////        1. Go to “https://qa1.vytrack.com/"
////        2. Login as a store manager
////        3. Navigate to “Activities -> Calendar Events”
//
//        extentLogger.info("Login as a Store Manager");
//        extentLogger.info("Navigate to --> Customers > Contacts");
//        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
//
////        create a methor in calendarEventsPage to login and navigate
//        calendarEventsPage.calendarEventObj();
//
//        BrowserUtils.waitForClickablility(By.cssSelector("[class='btn-group']>button"),5000);
//
// //       to click dropdown button and change the option 25 to 100
//        extentLogger.info("Click dropdown button");
//        driver.findElement(By.cssSelector("[class='btn-group']>button")).click();
//
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//
//        List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));
//
//
//        //click 100
//        extentLogger.info("Choose 100");
//        dropdownOptions.get(3).click();
//
//
//        //        Of 41-to get the total pages number using string manipulation
//        String pageNum = driver.findElement(By.xpath("//div[@class='pagination pagination-centered']/label[2]")).getText();
//
//        String[] split = pageNum.split(" ");
//
//        int pages = Integer.parseInt(split[1]);
//
//        //        to go to last page to start searching from last page the first page
//
//        Thread.sleep(3000);
//        extentLogger.info("Go to last page");
//        driver.findElement(By.cssSelector("[type='number']")).sendKeys(split[1], Keys.ENTER);
//
//        Thread.sleep(3000);
//
//
//
////       Select “Testers meeting”---we are using date to find the correct data
//        String expected = "Nov 27, 2020, 9:30 AM";
//
//        //changing pages one by one and searching our data in the list using date locator in the loops
//
//        boolean flag = true;
//        extentLogger.info("Find the Tester event page and open");
//        outer:while (flag) {
//            for (int i = pages; i >= 1 ; i--) {
//                calendarEventsPage.waitUntilLoaderScreenDisappear();
//
//                List<WebElement> numRows = driver.findElements(By.xpath("//table/tbody/tr"));
//
//
//                for (int j = 1; j <= numRows.size(); j++) {
//                    String element = "//tbody/tr[" + j + "]/td[4]";
//                    String actual = driver.findElement(By.xpath(element)).getText();
//                    if (actual.equals(expected)) {
//                        driver.findElement(By.xpath(element)).click();
//                        flag=false;
//                        break outer;
//                    }
//                }
//                driver.findElement(By.cssSelector(".fa-chevron-left.hide-text")).click();
//                Thread.sleep(1000);
//            }
//
//        }
//
////        to check if the correct page was found with the data.
////
//      Thread.sleep(2000);
//       List<String> expectedList = Arrays.asList("Title", "Testers meeting", "Description",
//               "This is a a weekly testers meeting", "Start",
//               "Nov 27, 2020, 9:30 AM","End",
//               "Nov 27, 2020, 10:30 AM","All-Day Event",
//               "No", "Organizer",
//               "Stephan Haley", "Call Via Hangout",
//               "No");
//
////        5. Verify that following data is displayed:
//
//        extentLogger.info("Check actual and expected data");
//        List<WebElement> controlGroup = driver.findElements(By.cssSelector(".control-label"));
//        List<String> actualList = BrowserUtils.getElementsText(controlGroup);
//        System.out.println(actualList);
//
//       Assert.assertEquals(actualList,expectedList,"Verify ");
//
//        extentLogger.pass("PASSED");
//
//
//
//    }
//
//}
