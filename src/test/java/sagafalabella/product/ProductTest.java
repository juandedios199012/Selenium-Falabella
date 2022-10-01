package sagafalabella.product;

import base.BaseTest;
import google.GoogleTest;
import helper.JsonTestDataHelper;
import model.google.Google;
import model.sagaFalabella.categorie.Categorie;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sagafalabella.categorie.CategorieTest;
import task.car.AddCant;
import task.car.AddWarranty;
import utilities.CloseShadowRoot;
import task.categorie.SearchCategorie;
import task.google.SearchGoogle;
import task.product.AddProductToCar;
import task.product.DetailsProduct;

import java.io.FileNotFoundException;

public class ProductTest extends BaseTest {

    @BeforeMethod
    public void setUpProductTests() throws FileNotFoundException {
        Categorie categorie = (Categorie) JsonTestDataHelper.getInstance().
                geTestData(CategorieTest.catogorieTestDataPath + "categorieData.json", Categorie.class)[0];
        SearchCategorie.withTheData(webDriver, categorie);
    }

    @Test
    public void testAddProduct(){
        AddProductToCar.isVisibleResultProduct(webDriver);
        DetailsProduct.onClickProduct(webDriver);
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
