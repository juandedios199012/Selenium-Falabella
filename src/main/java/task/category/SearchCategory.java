package task.category;

import actions.Enter;
import model.google.Google;
import model.sagaFalabella.categorie.Categorie;
import org.openqa.selenium.WebDriver;
import pages.product.CategoryPage;

public class SearchCategory {

    public static void withTheData(WebDriver webDriver, Google google){

        Enter.textWitEnter(webDriver, CategoryPage.inputSearchCaegorie, google.getCategorie());
    }


}
