package task.cart;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.shopping.ExtendedWarrantyPage;

public class AddWarranty {

    public static void onClickWarranty(WebDriver webDriver){
        WaitUntilElement.isPresent(webDriver, ExtendedWarrantyPage.buttonWarrantyOption);
        Click.on(webDriver, ExtendedWarrantyPage.buttonWarrantyOption);
        Click.on(webDriver, ExtendedWarrantyPage.buttonShowCart);

        //WaitUntilElement.isVisible(webDriver,)
        //Click.on(webDriver, ExtendedWarrantyPage.textCart);
    }


}
