package task.cart;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.shopping.ExtendedWarrantyPage;

public class AddWarranty {

    public static void onClickWarranty(WebDriver webDriver){
        WaitUntilElement.isPresent(webDriver, ExtendedWarrantyPage.BUTTON_WARRANTY_OPTION);
        Click.on(webDriver, ExtendedWarrantyPage.BUTTON_WARRANTY_OPTION);
        Click.on(webDriver, ExtendedWarrantyPage.BUTTON_SHOW_CART);

        //WaitUntilElement.isVisible(webDriver,)
        //Click.on(webDriver, ExtendedWarrantyPage.textCart);
    }


}
