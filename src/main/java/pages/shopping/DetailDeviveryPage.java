package pages.shopping;

import org.openqa.selenium.By;

public class DetailDeviveryPage {

    public static By INPUT_ADDRESS = By.id("address");
    public static By INPUT_DEPARTMENT_NUMBER = By.id("departmentNumber");
    public static By BUTTON_USE_ADDRESS = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__useAddress']");
    public static By BUTTON_GO_TO_PAY = By.cssSelector("button[class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");
}
