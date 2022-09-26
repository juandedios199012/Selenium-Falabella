package task.car;

import actions.Click;
import actions.WaitUntilElement;
import pages.BasePage;
import pages.car.ExtendedWarrantyPage;
import pages.car.OrderPage;

public class AddWarranty extends BasePage {

    public static void onClickWarranty(){
        Click.on(webDriver, ExtendedWarrantyPage.buttonWarrantyOption);
    }
}
