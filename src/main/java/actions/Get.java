package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Get {

    public static String getText(WebDriver webDriver, By locator) {
        return webDriver.findElement(locator).getText();
    }
}
