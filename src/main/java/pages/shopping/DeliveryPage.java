package pages.shopping;

import org.openqa.selenium.By;

public class DeliveryPage {

    public static By selectDepartment = By.id("region");
    public static By selectCity = By.id("ciudad");
    public static By selectComuna = By.id("comuna");
    public static By buttonContinueCheckout = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__field04']");
}
