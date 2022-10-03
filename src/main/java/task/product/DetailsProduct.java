package task.product;

import actions.Click;
import actions.IsDisplayed;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;

public class DetailsProduct {

    /*public AddProduct(WebDriver webDriver) {
        super(webDriver);
    }*/
    public static void clickAddToBagButton(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, ProductPage.ADD_BAG_BUTTON);
        Click.on(webDriver,ProductPage.ADD_BAG_BUTTON);
    }

    public static boolean isVisibleProductInformation(WebDriver webDriver){
        return IsDisplayed.element(webDriver, ProductPage.DETAIL_PRODUCT_INFORMATION);
    }

    public static void onClickProduct(WebDriver webDriver){
        //WaitUntilAlert.isPresent(webDriver);
        WaitUntilElement.isVisible(webDriver,ProductPage.linkProduct);
        Click.on(webDriver, ProductPage.IMAGE_ITEM);
        //Click.onClickElementList(webDriver, ProductPage.linkProduct,0);
    }
}
