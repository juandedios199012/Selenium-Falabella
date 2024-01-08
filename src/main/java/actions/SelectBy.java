package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy {

    public static void selectByVisibleText(WebDriver webDriver, By locator, String text) {
        Select select = new Select(webDriver.findElement(locator));
        select.selectByVisibleText(text);
    }
}
