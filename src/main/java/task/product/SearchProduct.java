package task.product;

import actions.Enter;
import model.Product;
import org.openqa.selenium.WebDriver;
import pages.product.CategoryPage;

public class SearchProduct {

    public static void withTheData(WebDriver webDriver, Product product){
        Enter.textWitEnter(webDriver, CategoryPage.INPUT_SEARCH_CATEGORY, product.getProduct());
    }


}
