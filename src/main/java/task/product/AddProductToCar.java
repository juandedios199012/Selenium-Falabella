package task.product;

import actions.Click;
import actions.WaitUntilElement;
import pages.BasePage;
import pages.product.ProductPage;

public class AddProductToCar extends BasePage {

    public static void onClickCar(){
        WaitUntilElement.isVisible(webDriver, ProductPage.buttonCar);
        Click.on(webDriver, ProductPage.buttonCar);
    }
}
