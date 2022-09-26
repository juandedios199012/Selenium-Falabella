package task.product;

import actions.Click;
import actions.WaitUntilElement;
import pages.BasePage;
import pages.product.ProductPage;

public class ShowProduct extends BasePage {

    /*public AddProduct(WebDriver webDriver) {
        super(webDriver);
    }*/

    public static void onClickProduct(){
        //WaitUntilAlert.isPresent(webDriver);
        WaitUntilElement.isVisible(webDriver,ProductPage.linkProduct);
        Click.on(webDriver, ProductPage.linkProduct);
    }
}
