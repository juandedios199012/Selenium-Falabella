package task.categorie;

import actions.Enter;
import org.openqa.selenium.WebDriver;
import pages.product.CategoriePage;

public class SearchCategorie {

    public static void withTheData(WebDriver webDriver, String word){
        Enter.textWitEnter(webDriver, CategoriePage.inputSearchCaegorie, word);
    }
}
