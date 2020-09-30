import Pages.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HomeExecution {
  public static   WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/");


    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;

    @Test
    public void HomeTest() throws InterruptedException, IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("LoginTest");

       // WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com");
        Home home= new Home(driver);
        home.Home("7871095629","qwaszx@654321");

        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 1)
    @Parameters("productnames")
    public void Searchtest(String productName) throws IOException {

        String path = System.getProperty("user.dir");
        extentTest = reports.createTest("Searchtest");
        // WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com");
        Search search = new Search(driver);
        search.Search(productName);
        try{
            Assert.assertTrue(search.CheckProductPresent(),productName+" not present");
            extentTest.log(Status.PASS, "search  success,"+productName+" present");
        }
        catch (Exception e){
            extentTest.log(Status.FAIL, "search failed,"+productName+" not present");

        }

        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();



    }

    @Test(priority = 2)
    public void Verifycartoption() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("Verifycartoption");

        // WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com")
        Add_To_Cart addToCart=new Add_To_Cart(this.driver);
        addToCart.Add_To_Cart();


        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 3)
    public void Addmultiproduct() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("Addmultiproduct");

        MultiProducts multiProducts = new MultiProducts(this.driver);
        multiProducts.Multiprdts();

        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();

    }
    @Test(priority = 4)
    public void MyBagTest() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("Addmultiproduct");

        MyBag myBag = new MyBag(driver);
        myBag.MyBag();

        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();

    }
    @Test(priority = 5)
    public void ordrsummaryTest() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("Addmultiproduct");

        Order_Summ orderSumm= new Order_Summ(driver);
        orderSumm.Order_Summ();

        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();

    }

    @Test(priority=6)
    public void Deletefrombag() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("Deletefrombag");

        DeleteFromCart deleteFromCart = new DeleteFromCart(driver);
        deleteFromCart.deletefromcart();

        extentTest.log(Status.PASS, "product removed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }


}































































































