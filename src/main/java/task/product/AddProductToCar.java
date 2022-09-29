package task.product;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;

public class AddProductToCar{

    public static void onClickCar(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, ProductPage.buttonCar);
        Click.on(webDriver, ProductPage.buttonCar);
    }
}
