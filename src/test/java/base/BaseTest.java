package base;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import report.ReportManager;
import utilities.DriverManager;

public class BaseTest {

    protected WebDriver webDriver;
    private String url = "https://www.google.com/";

    @BeforeSuite
    public static void setUpSuite() throws Exception {
        ReportManager.init("Reports", "SagaFallabellaSite");
    }


    @BeforeMethod
    public void setUp(ITestResult iTestResult)  {
        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());

        webDriver = new DriverManager().initLocalDriver();
        webDriver.getWindowHandles();
        webDriver.manage().deleteAllCookies();

        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        try {
            switch (iTestResult.getStatus()){
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test failed");
                    break;
                case ITestResult.SKIP:
                    ReportManager.getInstance().getTest().log(Status.SKIP, "Test skipped");
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS, "Test passed");
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test incomplete");
            }

            if(iTestResult.getStatus() != ITestResult.SUCCESS && iTestResult.getThrowable() != null){
                ReportManager.getInstance().getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage());
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.FAIL, "Failure Image");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(webDriver != null)
                webDriver.quit();
        }
    }

    @AfterSuite
    public static void tearDownSuite(){
        ReportManager.getInstance().flush();

    }
}