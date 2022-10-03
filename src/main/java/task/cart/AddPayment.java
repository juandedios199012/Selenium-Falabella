package task.cart;

import actions.Click;
import actions.Enter;
import actions.SelectBy;
import actions.WaitUntilElement;
import helper.JsonTestDataHelper;
import model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.Payment.PaymentPage;
import pages.shopping.DeliveryPage;

public class AddPayment {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    public static boolean isVisibleIsPaymentPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, PaymentPage.optionGiftCard);
    }

    public static void withTheData(WebDriver webDriver, Product product){
        logger.info("Add GiftCard");
        Click.on(webDriver,PaymentPage.optionGiftCard);
        Enter.text(webDriver,PaymentPage.inputGiftCardNumber,product.getGiftCardNumber());
        Enter.text(webDriver,PaymentPage.inputGiftCardSecurityCode,product.getPassword());
        Click.on(webDriver,PaymentPage.buttonAddGiftCard);
    }
}
