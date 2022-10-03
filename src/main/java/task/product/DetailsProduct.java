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
    public static boolean isVisibleAddToBagButton(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, ProductPage.DETAIL_PRODUCT_NAME);
    }

    public static boolean isVisibleProductInformation(WebDriver webDriver){
        return IsDisplayed.element(webDriver, ProductPage.DETAIL_PRODUCT_INFORMATION);
    }

    public static void onClickProduct(WebDriver webDriver){
        //WaitUntilAlert.isPresent(webDriver);

        WaitUntilElement.isVisible(webDriver,ProductPage.linkProduct);
        Click.onClickElementList(webDriver, ProductPage.linkProduct,0);
        Click.on(webDriver,ProductPage.DETAIL_PRODUCT_NAME);

    }
}
