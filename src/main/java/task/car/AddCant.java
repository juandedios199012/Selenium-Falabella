package task.car;

import actions.Click;
import actions.WaitUntilElement;
import pages.BasePage;
import pages.car.OrderPage;
import pages.product.ProductPage;

public class AddCant extends BasePage {

    public static void onClickCant(){
        WaitUntilElement.isVisible(webDriver, OrderPage.buttonCant);
        Click.on(webDriver, OrderPage.buttonCant);
    }
}
