package task.cart;

import actions.*;
import pages.product.helper.JsonTestDataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.Payment.Alert;

public class ViewAlert {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static boolean isVisibleIsDeliveryPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, Alert.ALERT);
    }

    public static String getTextAlert(WebDriver webDriver){
        logger.info("Alert");
        return Get.getText(webDriver, Alert.ALERT);


    }
}