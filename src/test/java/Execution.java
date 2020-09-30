import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class Execution {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;

    @Test(priority = 1)
    public void LoginTest() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("LoginTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/login");
        Login loginPage = new Login(driver);
        loginPage.Login("9562087407", "password@123");
        extentTest.log(Status.PASS, "Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
         Driver.closeBrowser();
        reports.flush();

    }
//    @Test(priority = 4)
//    public void SearchTest() throws IOException {
//
//        String path = System.getProperty("user.dir");
//        reports = new ExtentReports();
//        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
//        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
//        reports.attachReporter(extentSparkReporter);
//        extentTest = reports.createTest("SearchTest");
//        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/");
//        Search Searchpage = new Search(driver);
//        Searchpage.Search("Sunglasses");
//        extentTest.log(Status.PASS, "Login Passed");
//        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
//         Driver.closeBrowser();
//        reports.flush();
//    }
////
////    @Test(priority = 5)
////    public void ChooseTest() throws IOException {
////
////        String path = System.getProperty("user.dir");
////        reports = new ExtentReports();
////        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
////        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
////        reports.attachReporter(extentSparkReporter);
////        extentTest = reports.createTest("ChooseTest");
////        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/search/?text=sunglass");
////        Choose Chooseprod = new Choose(driver);
////        Chooseprod.Choose();
////        extentTest.log(Status.PASS, "Login Passed");
////        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
////         Driver.closeBrowser();
////        reports.flush();
////    }
//
//    WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/search/?text=sunglass");
//
//    @Test(priority = 1)
//    public void MultTest() throws IOException {
//
//        String path = System.getProperty("user.dir");
//        reports = new ExtentReports();
//        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
//        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
//        reports.attachReporter(extentSparkReporter);
//        extentTest = reports.createTest("MultTest");
////        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/search/?text=sunglass");
//        Mult Multprod = new Mult(driver);
//        Multprod.Mult();
//        extentTest.log(Status.PASS, "Login Passed");
//        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
//        // Driver.closeBrowser();
//        reports.flush();
//    }
//
//    @Test(priority = 2)
//    public void BagTest() throws IOException {
//        String path = System.getProperty("user.dir");
//        reports = new ExtentReports();
//        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
//        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
//        reports.attachReporter(extentSparkReporter);
//        extentTest = reports.createTest("BagTest");
////        WebDriver driver = Driver.openBrowser("chrome", null);
//        Bag Check = new Bag(driver);
//        Check.Bag();
//        extentTest.log(Status.PASS, "Login Passed");
//        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
//        // Driver.closeBrowser();
//        reports.flush();
//    }
//    @Test(priority = 3)
//    public void OrdrsumTest() throws IOException {
//        String path = System.getProperty("user.dir");
//        reports = new ExtentReports();
//        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
//        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
//        reports.attachReporter(extentSparkReporter);
//        extentTest = reports.createTest("OrdrTest");
////        WebDriver driver = Driver.openBrowser("chrome", null);
//        Ordrsum Check = new Ordrsum(driver);
//        Check.Ordrsum();
//        extentTest.log(Status.PASS, "Login Passed");
//        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
//        // Driver.closeBrowser();
//        reports.flush();
 }


