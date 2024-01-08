package task.product;

import actions.Click;
import actions.IsDisplayed;
import helper.JsonTestDataHelper;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;

public class DetailsProduct {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static void addProductToBag(WebDriver webDriver, Product product) {
        isVisibleProductInformation(webDriver, ProductPage.ITEM_PRODUCT);
        logger.info("Click item product");
        Click.onClickElementList(webDriver, ProductPage.ITEM_PRODUCT, product.getNumberOrder());
        isVisibleProductInformation(webDriver, ProductPage.ADD_BAG_BUTTON);
        logger.info("Click add bag button");
        Click.on(webDriver, ProductPage.ADD_BAG_BUTTON);
    }

    public static void isVisibleProductInformation(WebDriver webDriver, By locator) {
        IsDisplayed.element(webDriver, locator);
    }
}
