package task.cart;

import actions.Click;
import actions.SelectBy;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.shopping.DeliveryPage;

public class AddDelivery {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static void isVisibleDeliveryPage(WebDriver webDriver, By locator) {
        WaitUntilElement.isVisibility(webDriver, locator);
    }

    public static void withTheData(WebDriver webDriver, Product product) {
        logger.info("Select Delivery Region");
        isVisibleDeliveryPage(webDriver, DeliveryPage.SELECT_DEPARTMENT);
        SelectBy.selectByVisibleText(webDriver, DeliveryPage.SELECT_DEPARTMENT, product.getDepartment());
        logger.info("Select Delivery City");
        isVisibleDeliveryPage(webDriver, DeliveryPage.SELECT_CITY);
        SelectBy.selectByVisibleText(webDriver, DeliveryPage.SELECT_CITY, product.getProvince());
        logger.info("Select Delivery Comuna");
        isVisibleDeliveryPage(webDriver, DeliveryPage.SELECT_COMUNA);
        SelectBy.selectByVisibleText(webDriver, DeliveryPage.SELECT_COMUNA, product.getNeighborhood());
        Click.on(webDriver, DeliveryPage.BUTTON_CONTINUE_CHECKOUT);
    }
}
