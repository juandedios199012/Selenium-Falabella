package sagafalabella.product;

import base.BaseTest;
import org.testng.annotations.Test;
import task.categorie.SearchCategorie;
import task.google.SearchGoogle;
import task.product.ShowProduct;

public class ProductTest extends BaseTest {

    @Test
    public void testAddProduct(){
        SearchGoogle.withTheData(webDriver, "Falabella.co");
        SearchCategorie.withTheData(webDriver, "Televisor Exclusiv");
        ShowProduct.onClickProduct();
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
