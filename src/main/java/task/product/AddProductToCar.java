package task.product;

import actions.Click;
import actions.WaitUntilElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;
import pages.product.helper.JsonTestDataHelper;

public class AddProductToCar{
    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static boolean isVisibleResultProduct(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, ProductPage.RESULT_LIST_SEARCH);

    }

    public static void onClickCar(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, ProductPage.ADD_BAG_BUTTON);
        logger.info("Click add bag button");
        Click.on(webDriver, ProductPage.ADD_BAG_BUTTON);
    }
}
