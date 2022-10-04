package task.cart;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.shopping.ExtendedWarrantyPage;

public class Basket {
    public static void isVisibleBasketPage(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, ExtendedWarrantyPage.TEXT_CART);
        //Click.on(webDriver, ExtendedWarrantyPage.textCart);
    }
}
