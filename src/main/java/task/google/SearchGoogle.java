package task.google;

import actions.Click;
import actions.Enter;
import model.Product;
import org.openqa.selenium.WebDriver;
import pages.google.GoogleSearchPage;

public class SearchGoogle {

    public static void withTheData(WebDriver webDriver, Product product){
        Enter.textWitEnter(webDriver, GoogleSearchPage.inputSearch, product.getWord());
        Click.on(webDriver, GoogleSearchPage.linkFalabella);
    }


}
