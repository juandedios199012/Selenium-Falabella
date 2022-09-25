package task.google;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.google.GoogleSearchPage;
import pages.product.CategoriePage;
import task.categorie.SearchCategorie;

public class SearchGoogle {

    public static void withTheData(WebDriver webDriver, String word){
        Enter.textWitEnter(webDriver, GoogleSearchPage.inputSearch, word);
        Click.on(webDriver, GoogleSearchPage.linkFalabella);
    }
}
