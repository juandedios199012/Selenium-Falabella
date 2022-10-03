package sagafalabella.shoppingCar;

import base.BaseTest;
import helper.JsonTestDataHelper;
import model.google.Google;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import task.cart.AddWarranty;
import task.cart.Basket;
import task.category.SearchCategory;
import task.product.AddProductToCar;
import task.product.DetailsProduct;
import task.google.SearchGoogle;


import java.io.FileNotFoundException;

public class OrderTest extends BaseTest {

    public static String googleTestDataPath = "resource/testData/google/";

    @Test(dataProvider="googleDataProvider")
    public void testOrder(Google google){
        SearchGoogle.withTheData(webDriver, google);
        SearchCategory.withTheData(webDriver, google);
        AddProductToCar.isVisibleResultProduct(webDriver);
        DetailsProduct.onClickProduct(webDriver);
        DetailsProduct.isVisibleAddToBagButton(webDriver);


        AddWarranty.onClickWarranty(webDriver);
        Basket.isVisibleBasketPage(webDriver);

        /*
        AddProductToCar.isVisibleResultProduct(webDriver);

        AddProductToCar.onClickCar(webDriver);
        AddCant.onClickCant(webDriver);
        AddWarranty.onClickWarranty(webDriver);
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
         */
    }

    @DataProvider(name="googleDataProvider")
    public Object[] googleDataProvider() throws FileNotFoundException {
        return JsonTestDataHelper.getInstance().geTestData(googleTestDataPath + "googleData.json", Google.class);
    }
}
