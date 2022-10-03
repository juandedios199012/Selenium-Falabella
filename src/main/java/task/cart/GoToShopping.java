package task.cart;

import actions.Click;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.shopping.BasketPage;

public class GoToShopping {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static boolean isVisibleButtonGoToShopping(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, BasketPage.buttonGoToShipping);

    }

    public static void onClickGoToShopping(WebDriver webDriver){
        logger.info("Clicking on Go to Shopping");
        Click.on(webDriver, BasketPage.buttonGoToShipping);
    }
}
