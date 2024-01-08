package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Enter {
    public static void text(WebDriver webDriver, By locator, String text) {
        webDriver.findElement(locator).sendKeys(text);
    }

    public static void textWitEnter(WebDriver webDriver, By locator, String text) {
        webDriver.findElement(locator).sendKeys(text, Keys.ENTER);
    }
}
