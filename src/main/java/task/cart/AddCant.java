package task.cart;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.cart.OrderPage;

public class AddCant {

    public static void onClickCant(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, OrderPage.buttonCant);
        Click.on(webDriver, OrderPage.buttonCant);
    }
}
