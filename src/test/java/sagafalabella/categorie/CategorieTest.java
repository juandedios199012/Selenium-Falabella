package sagafalabella.categorie;

import base.BaseTest;
import org.testng.annotations.Test;
import task.categorie.SearchCategorie;
import task.google.SearchGoogle;

public class CategorieTest extends BaseTest {

    @Test
    public void testSearchCategorie(){
        SearchGoogle.withTheData(webDriver, "Falabella.co");
        SearchCategorie.withTheData(webDriver, "Televisor Exclusiv");
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));

        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
