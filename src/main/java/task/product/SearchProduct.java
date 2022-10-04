package task.product;

import actions.Enter;
import actions.IsDisplayed;
import actions.WaitUntilElement;
import model.Product;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.product.CategoryPage;
import pages.product.ProductPage;

public class SearchProduct {

    public static void withTheData(WebDriver webDriver, Product product){
        Enter.textWitEnter(webDriver, CategoryPage.INPUT_SEARCH_CATEGORY, product.getProduct());
        Assert.assertTrue(IsDisplayed.element(webDriver,ProductPage.RESULT_LIST_SEARCH ));
    }
}
