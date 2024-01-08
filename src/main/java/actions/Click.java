package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class Click {
    public static void on(WebDriver webDriver, By locator) {
        webDriver.findElement(locator).click();
    }

    public static void onClickShadowRootElement(WebDriver webDriver, By root, By element) {
        SearchContext searchContext = webDriver.findElement(root).getShadowRoot();
        searchContext.findElement(element).click();
    }

    public static void onClickElementList(WebDriver webDriver, By locator, int element) {
        webDriver.findElements(locator).get(element).click();
    }
}
