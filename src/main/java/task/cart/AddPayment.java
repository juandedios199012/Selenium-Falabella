package task.cart;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import pages.product.helper.JsonTestDataHelper;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.Payment.PaymentPage;

public class AddPayment {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static boolean isVisibleIsPaymentPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, PaymentPage.OPTION_GIFT_CARD);
    }

    public static void withTheData(WebDriver webDriver, Product product){
        logger.info("Add GiftCard");
        Click.on(webDriver,PaymentPage.OPTION_GIFT_CARD);
        Enter.text(webDriver,PaymentPage.INPUT_GIFT_CARD_NUMBER,product.getGiftCardNumber());
        Enter.text(webDriver,PaymentPage.INPUT_GIFT_CARD_SECURITY_CODE,product.getPassword());
        Click.on(webDriver,PaymentPage.BUTTON_ADD_GIFT_CARD);
    }
}
