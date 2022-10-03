package task.product;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.product.ProductPage;

public class AddProductToCar{

    public static boolean isVisibleResultProduct(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, ProductPage.RESULT_LIST_SEARCH);

    }

    public static void onClickCar(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, ProductPage.ADD_BAG_BUTTON);
        Click.on(webDriver, ProductPage.ADD_BAG_BUTTON);
    }
}
