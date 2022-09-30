package sagafalabella.product;

import base.BaseTest;
import org.testng.annotations.Test;
import task.CloseShadowRoot;
import task.categorie.SearchCategorie;
import task.google.SearchGoogle;
import task.product.AddProductToCar;
import task.product.DetailsProduct;

public class ProductTest extends BaseTest {

    @Test
    public void testAddProduct(){
        SearchGoogle.withTheData(webDriver, "Falabella.co");
        CloseShadowRoot.onClickClose(webDriver);
        SearchCategorie.withTheData(webDriver, "Televisor 32 LG");
        AddProductToCar.isVisibleResultProduct(webDriver);
        DetailsProduct.onClickProduct(webDriver);
        AddCant.onClickCant(webDriver);
        AddWarranty.onClickWarranty(webDriver);
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
