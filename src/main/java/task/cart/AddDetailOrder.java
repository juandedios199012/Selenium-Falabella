package task.cart;

import actions.Click;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.shopping.BasketPage;
import pages.shopping.OrderPage;

public class AddDetailOrder {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static void isVisibleDetailOrderPage(WebDriver webDriver, By locator){
        WaitUntilElement.isVisibility(webDriver, locator);
    }

    public static void addDetailOrder(WebDriver webDriver) throws InterruptedException {
        isVisibleDetailOrderPage(webDriver,OrderPage.BUTTON_CANT);
        Click.on(webDriver, OrderPage.BUTTON_CANT);
        Click.on(webDriver, OrderPage.BUTTON_WARRANTY_OPTION);
        Click.on(webDriver, OrderPage.BUTTON_SHOW_CART);
        Thread.sleep(5000);
        logger.info("Clicking on Go to Shopping");
        isVisibleDetailOrderPage(webDriver,BasketPage.BUTTON_GO_TO_SHIPPING);
        Click.on(webDriver, BasketPage.BUTTON_GO_TO_SHIPPING);
    }
}
