package base;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.DriverManager;

public class BaseTest {

    protected WebDriver webDriver;
    private String url = "https://testfaceclub.com/aut-products/";

    @BeforeMethod
    public void setUp() throws Exception {
        webDriver = new DriverManager().initLocalDriver();
        webDriver.getWindowHandles();
        webDriver.manage().deleteAllCookies();

        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }
}
