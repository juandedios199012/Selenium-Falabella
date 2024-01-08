package task.cart;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Payment.PaymentPage;

public class AddPayment {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static void isVisiblePaymentPage(WebDriver webDriver, By locator) {
        WaitUntilElement.isVisibility(webDriver, locator);
    }

    public static void withTheData(WebDriver webDriver, Product product) {
        logger.info("Add GiftCard");
        isVisiblePaymentPage(webDriver, PaymentPage.OPTION_GIFT_CARD);
        Click.on(webDriver, PaymentPage.OPTION_GIFT_CARD);
        isVisiblePaymentPage(webDriver, PaymentPage.INPUT_GIFT_CARD_NUMBER);
        Enter.text(webDriver, PaymentPage.INPUT_GIFT_CARD_NUMBER, product.getGiftCardNumber());
        Enter.text(webDriver, PaymentPage.INPUT_GIFT_CARD_SECURITY_CODE, product.getPassword());
        Click.on(webDriver, PaymentPage.BUTTON_ADD_GIFT_CARD);
    }
}
