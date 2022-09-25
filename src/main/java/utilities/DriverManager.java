package utilities;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.io.File;
import java.io.IOException;

public class DriverManager {
    //private final Logs log = new Logs();
    private String browser;
    private final String screenshotPath = "src/test/resources/screenshots";

    public WebDriver initLocalDriver() {
        if (browser == null) {
      //      log.debug("Setting chrome as default browser");
            browser = "CHROME";
        }

        switch (browser) {
            case "CHROME":
                ChromeDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "EDGE":
                EdgeDriverManager.edgedriver().setup();
                return new EdgeDriver();
            default:
                return null;
        }
    }
}
