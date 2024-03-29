package task.cart;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.shopping.DetailDeviveryPage;

public class AddDetailDelivery {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static void isVisibleIsDetailDeliveryPage(WebDriver webDriver, By locator) {
        WaitUntilElement.isVisibility(webDriver, locator);
    }

    public static void withTheData(WebDriver webDriver, Product product) {
        logger.info("Add Detail Delivery");
        isVisibleIsDetailDeliveryPage(webDriver, DetailDeviveryPage.INPUT_ADDRESS);
        Enter.text(webDriver, DetailDeviveryPage.INPUT_ADDRESS, product.getAddress());
        Enter.text(webDriver, DetailDeviveryPage.INPUT_DEPARTMENT_NUMBER, product.getDepartmentNumber());
        Click.on(webDriver, DetailDeviveryPage.BUTTON_USE_ADDRESS);
        isVisibleIsDetailDeliveryPage(webDriver, DetailDeviveryPage.BUTTON_GO_TO_PAY);
        Click.on(webDriver, DetailDeviveryPage.BUTTON_GO_TO_PAY);
    }
}

