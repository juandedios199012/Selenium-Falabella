package task.product;

import actions.Click;
import actions.IsDisplayed;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;

public class DetailsProduct {

    public static void clickAddToBagButton(WebDriver webDriver){
        WaitUntilElement.isPresent(webDriver, ProductPage.ADD_BAG_BUTTON);
        Click.on(webDriver,ProductPage.ADD_BAG_BUTTON);
    }

    public static boolean isVisibleProductInformation(WebDriver webDriver){
        return IsDisplayed.element(webDriver, ProductPage.DETAIL_PRODUCT_INFORMATION);
    }

    public static void onClickProduct(WebDriver webDriver){
        Click.onClickElementList(webDriver, ProductPage.ITEM_PRODUCT,0);
    }
}
