package sagafalabella.shoppingCar;

import base.BaseTest;
import org.testng.annotations.Test;
import task.CloseShadowRoot;
import task.car.AddCant;
import task.car.AddWarranty;
import task.categorie.SearchCategorie;
import task.google.SearchGoogle;
import task.product.AddProductToCar;
import task.product.DetailsProduct;

public class OrderTest extends BaseTest {

    @Test
    public void testOrder(){
        SearchGoogle.withTheData(webDriver, "Falabella.co");
        CloseShadowRoot.onClickClose(webDriver);
        SearchCategorie.withTheData(webDriver, "Televisor Exclusiv");
        DetailsProduct.onClickProduct(webDriver);
        AddProductToCar.onClickCar(webDriver);
        AddCant.onClickCant(webDriver);
        AddWarranty.onClickWarranty(webDriver);
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
