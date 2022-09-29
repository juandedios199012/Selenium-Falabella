package task.car;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.car.OrderPage;
import pages.product.ProductPage;

public class AddCant {

    public static void onClickCant(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, OrderPage.buttonCant);
        Click.on(webDriver, OrderPage.buttonCant);
    }
}
