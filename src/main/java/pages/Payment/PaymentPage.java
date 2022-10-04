package pages.Payment;

import org.openqa.selenium.By;

public class PaymentPage {

    public static By OPTION_GIFT_CARD = By.cssSelector ("div[class='gitfcardAnchor--left']");
    public static By INPUT_GIFT_CARD_NUMBER = By.id("giftCardNumber");
    public static By INPUT_GIFT_CARD_SECURITY_CODE =By.id("giftCardSecurityCode");
    public static By BUTTON_ADD_GIFT_CARD = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__addGiftCard']");
}
