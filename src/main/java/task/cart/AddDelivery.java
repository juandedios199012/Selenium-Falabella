package task.cart;

import actions.Click;
import actions.Enter;
import actions.SelectBy;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.shopping.BasketPage;
import pages.shopping.DeliveryPage;

public class AddDelivery {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static boolean isVisibleIsDeliveryPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, DeliveryPage.selectDepartment);
    }

    public static void withTheData(WebDriver webDriver, Product product){
        logger.info("Select Delivery Region");
        SelectBy.selectByVisibleText(webDriver,DeliveryPage.selectDepartment, product.getDepartment());
        logger.info("Select Delivery City");
        WaitUntilElement.isPresent(webDriver, DeliveryPage.selectCity);
        SelectBy.selectByVisibleText(webDriver,DeliveryPage.selectCity, product.getProvince());
        logger.info("Select Delivery Comuna");
        WaitUntilElement.isPresent(webDriver, DeliveryPage.selectComuna);
        SelectBy.selectByVisibleText(webDriver,DeliveryPage.selectComuna, product.getNeighborhood());
        Click.on(webDriver,DeliveryPage.buttonContinueCheckout);
    }
}
