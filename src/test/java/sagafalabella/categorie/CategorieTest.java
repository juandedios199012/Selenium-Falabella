package sagafalabella.categorie;

import base.BaseTest;
import google.GoogleTest;
import helper.JsonTestDataHelper;
import model.google.Google;
import model.sagaFalabella.categorie.Categorie;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.CloseShadowRoot;
import task.categorie.SearchCategorie;
import task.google.SearchGoogle;

import java.io.FileNotFoundException;

public class CategorieTest extends BaseTest {

    public static String catogorieTestDataPath = "resource/testData/sagaFalabella/categorie/";

    @BeforeMethod
    public void setUpCategorieTests() throws FileNotFoundException {
        Google google = (Google) JsonTestDataHelper.getInstance().
                geTestData(GoogleTest.googleTestDataPath + "googleData.json", Google.class)[0];
        SearchGoogle.withTheData(webDriver, google);
        CloseShadowRoot.onClickClose(webDriver);
    }

    @Test(dataProvider="categorieDataProvider")
    public void testSearchCategorie(Google google, Categorie categorie){
        SearchCategorie.withTheData(webDriver, categorie);
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }

    @DataProvider(name="categorieDataProvider")
    public Object[] categorieDataProvider() throws FileNotFoundException {
        return JsonTestDataHelper.getInstance().geTestData(catogorieTestDataPath + "categorieData.json", Categorie.class);
    }
}
