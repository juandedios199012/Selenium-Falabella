package pages.car;

import org.openqa.selenium.By;

public class ExtendedWarrantyPage {
    public static By buttonWarrantyOption = By.id("testId-InCart-inPDP-WarrantyOption-btn-0");    
    public static By buttonShowCart = By.id("linkButton");
    public static By buttonGoToShipping = By.cssSelector("button[class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");

    //localizador de Departamento (lista)
    public static By selectDepartment = By.id("region");

    //localizador de Ciudad (lista)
    public static By selectCity = By.id("ciudad");

    //localizador de Comuna (lista)
    public static By selectComuna = By.id("comuna");

    //localizador para continuar despacho
    public static By buttonContinueCheckout = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__field04']");
}
