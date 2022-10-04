package task.cart;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.shopping.OrderPage;

public class AddCant {

    public static void onClickCant(WebDriver webDriver){
        WaitUntilElement.isPresent(webDriver, OrderPage.BUTTON_CANT);
        Click.on(webDriver, OrderPage.BUTTON_CANT);
    }
}