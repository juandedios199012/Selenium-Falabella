package pages.shopping;

import org.openqa.selenium.By;

public class DeliveryPage {

    public static By SELECT_DEPARTMENT = By.id("region");
    public static By SELECT_CITY = By.id("ciudad");
    public static By SELECT_COMUNA = By.id("comuna");
    public static By BUTTON_CONTINUE_CHECKOUT = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__field04']");
}
