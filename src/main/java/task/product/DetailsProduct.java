package task.product;

import actions.Click;
import actions.IsDisplayed;
import actions.WaitUntilElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;
import pages.product.helper.JsonTestDataHelper;

public class DetailsProduct {
    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static void clickAddToBagButton(WebDriver webDriver){
        WaitUntilElement.isPresent(webDriver, ProductPage.ADD_BAG_BUTTON);
        logger.info("Click add bag button");
        Click.on(webDriver,ProductPage.ADD_BAG_BUTTON);
    }

    public static boolean isVisibleProductInformation(WebDriver webDriver){
        logger.info("Is display detail product information");
        return IsDisplayed.element(webDriver, ProductPage.DETAIL_PRODUCT_INFORMATION);
    }

    public static void onClickProduct(WebDriver webDriver){
        logger.info("Click item product");
        Click.onClickElementList(webDriver, ProductPage.ITEM_PRODUCT,0);
    }
}
