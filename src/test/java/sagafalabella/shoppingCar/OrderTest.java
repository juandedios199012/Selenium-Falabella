package sagafalabella.shoppingCar;

import base.BaseTest;
import google.GoogleTest;
import helper.JsonTestDataHelper;
import model.google.Google;
import model.sagaFalabella.categorie.Categorie;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sagafalabella.categorie.CategorieTest;
import utilities.CloseShadowRoot;
import task.car.AddCant;
import task.car.AddWarranty;
import task.categorie.SearchCategorie;
import task.product.AddProductToCar;
import task.product.DetailsProduct;

import java.io.FileNotFoundException;

public class OrderTest extends BaseTest {

    @BeforeMethod
    public void setUpOrderTests() throws FileNotFoundException {
        Categorie categorie = (Categorie) JsonTestDataHelper.getInstance().
                geTestData(CategorieTest.catogorieTestDataPath + "categorieData.json", Categorie.class)[0];
        SearchCategorie.withTheData(webDriver, categorie);
        DetailsProduct.onClickProduct(webDriver);
    }

    @Test
    public void testOrder(){
        AddProductToCar.onClickCar(webDriver);
        AddCant.onClickCant(webDriver);
        AddWarranty.onClickWarranty(webDriver);
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
