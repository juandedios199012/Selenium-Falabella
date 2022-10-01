package task.categorie;

import actions.Enter;
import model.sagaFalabella.categorie.Categorie;
import org.openqa.selenium.WebDriver;
import pages.product.CategoriePage;

public class SearchCategorie {

    public static void withTheData(WebDriver webDriver, Categorie categorie){
        Enter.textWitEnter(webDriver, CategoriePage.inputSearchCaegorie, categorie.getCategorie());
    }


}
