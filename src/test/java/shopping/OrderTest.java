package shopping;

import base.BaseTest;
import helper.JsonTestDataHelper;
import model.Product;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import task.cart.*;
import task.product.SearchProduct;
import task.product.DetailsProduct;
import task.google.SearchGoogle;
import utilities.CloseShadowRoot;


import java.io.FileNotFoundException;

public class OrderTest extends BaseTest {

    public static String productTestDataPath = "resource/testData/product/";

    @Test(dataProvider="productDataProvider")
    public void testOrder(Product product) throws InterruptedException {
        SearchGoogle.withTheData(webDriver, product);
        CloseShadowRoot.onClickClose(webDriver);
        SearchProduct.withTheData(webDriver, product);
        DetailsProduct.addProductToBag(webDriver,product);
        AddDetailOrder.addDetailOrder(webDriver);
        AddDelivery.withTheData(webDriver,product);
        AddDetailDelivery.withTheData(webDriver,product);
        AddPayment.withTheData(webDriver,product);

        Assert.assertEquals(ShowAlert.getTextAlert(webDriver),product.getAlert());

    }

    @DataProvider(name="productDataProvider")
    public Object[] googleDataProvider() throws FileNotFoundException {
        return JsonTestDataHelper.getInstance().geTestData(productTestDataPath + "productData.json", Product.class);
    }
}
