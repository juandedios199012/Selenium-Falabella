package pages.shopping;

import org.openqa.selenium.By;

public class DetailDeviveryPage {

    public static By inputAddress = By.id("address");
    public static By inputDepartmentNumber = By.id("departmentNumber");
    public static By buttonUseAddress = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__useAddress']");
    public static By buttonGoToPay = By.cssSelector("button[class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");
}
