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
import pages.shopping.DeliveryPage;
import pages.shopping.DetailDeviveryPage;

public class AddDetailDelivery {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static boolean isVisibleIsDetailDeliveryPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, DetailDeviveryPage.inputAddress);
    }

    public static void withTheData(WebDriver webDriver, Product product){
        logger.info("Add Detail Delivery");
        Enter.text(webDriver,DetailDeviveryPage.inputAddress,product.getAddress());
        Enter.text(webDriver,DetailDeviveryPage.inputDepartmentNumber,product.getDepartmentNumber());
        Click.on(webDriver,DetailDeviveryPage.buttonUseAddress);
        WaitUntilElement.isPresent(webDriver, DetailDeviveryPage.buttonGoToPay);
        Click.on(webDriver,DetailDeviveryPage.buttonGoToPay);
    }
}

