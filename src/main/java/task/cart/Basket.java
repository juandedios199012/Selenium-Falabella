package task.cart;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.cart.ExtendedWarrantyPage;

public class Basket {
    public static void isVisibleBasketPage(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, ExtendedWarrantyPage.textCart);
        //Click.on(webDriver, ExtendedWarrantyPage.textCart);
    }
}
