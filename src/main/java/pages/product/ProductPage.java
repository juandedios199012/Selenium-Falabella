package pages.product;

import org.openqa.selenium.By;

public class ProductPage {

    public static By linkProduct = By.xpath("//div[@class='jsx-4001457643 search-results-4-grid grid-pod']");
    public static By buttonCar = By.id("buttonForCustomers");
    public static By ADD_BAG_BUTTON = By.id("buttonForCustomers");
    public static By DETAIL_PRODUCT_INFORMATION = By.id("productInfoContainer");

    //Search result
    public static By RESULT_LIST_SEARCH = By.id("testId-searchResults-products");
    public static By IMAGE_ITEM = By.cssSelector("//img[@id='testId-pod-image-32332326']");

}
