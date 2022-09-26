package sagafalabella.shoppingCar;

import base.BaseTest;
import org.testng.annotations.Test;
import task.car.AddCant;
import task.car.AddWarranty;
import task.categorie.SearchCategorie;
import task.google.SearchGoogle;
import task.product.ShowProduct;

public class OrderTest extends BaseTest {

    @Test
    public void testOrder(){
        SearchGoogle.withTheData(webDriver, "Falabella.co");
        SearchCategorie.withTheData(webDriver, "Televisor Exclusiv");
        ShowProduct.onClickProduct();
        AddCant.onClickCant();
        AddWarranty.onClickWarranty();
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
