package task.car;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.car.ExtendedWarrantyPage;
import pages.car.OrderPage;

public class AddWarranty {

    public static void onClickWarranty(WebDriver webDriver){
        Click.on(webDriver, ExtendedWarrantyPage.buttonWarrantyOption);
    }
}
