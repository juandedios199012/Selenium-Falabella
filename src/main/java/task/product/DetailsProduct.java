package task.product;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;

public class DetailsProduct {

    /*public AddProduct(WebDriver webDriver) {
        super(webDriver);
    }*/

    public static void onClickProduct(WebDriver webDriver){
        //WaitUntilAlert.isPresent(webDriver);
        WaitUntilElement.isVisible(webDriver,ProductPage.linkProduct);
        Click.onClickElementList(webDriver, ProductPage.linkProduct,0);
    }
}
