package task.cart;

import actions.Get;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Payment.AlertPage;

public class ShowAlert {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static void isVisibleIsAlertPage(WebDriver webDriver, By locator) {
        WaitUntilElement.isVisibility(webDriver, locator);
    }

    public static String getTextAlert(WebDriver webDriver) {
        logger.info("Show Alert");
        isVisibleIsAlertPage(webDriver, AlertPage.ALERT);
        return Get.getText(webDriver, AlertPage.ALERT);
    }
}
