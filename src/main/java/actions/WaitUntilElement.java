package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUntilElement {
    public static boolean isPresent(WebDriver webDriver, By locator){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isVisible(WebDriver webDriver, By locator){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.invisibilityOf(webDriver.findElement(locator)));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
