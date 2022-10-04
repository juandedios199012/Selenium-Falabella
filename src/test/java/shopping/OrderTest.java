package shopping;

import base.BaseTest;
import pages.product.helper.JsonTestDataHelper;
import model.Product;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import task.cart.*;
import task.product.SearchProduct;
import task.product.AddProductToCar;
import task.product.DetailsProduct;
import task.google.SearchGoogle;
import utilities.CloseShadowRoot;


import java.io.FileNotFoundException;

public class OrderTest extends BaseTest {


    public static String productTestDataPath = "resource/testData/product/";

    @Test(dataProvider="productDataProvider")
    public void testOrder(Product product){
        SearchGoogle.withTheData(webDriver, product);
        CloseShadowRoot.onClickClose(webDriver);
        SearchProduct.withTheData(webDriver, product);
        AddProductToCar.isVisibleResultProduct(webDriver);
        DetailsProduct.onClickProduct(webDriver);
        DetailsProduct.clickAddToBagButton(webDriver);
        AddCant.onClickCant(webDriver);
        AddWarranty.onClickWarranty(webDriver);
        GoToShopping.isVisibleButtonGoToShopping(webDriver);
        GoToShopping.onClickGoToShopping(webDriver);
        AddDelivery.isVisibleIsDeliveryPage(webDriver);
        AddDelivery.withTheData(webDriver,product);
        AddDetailDelivery.isVisibleIsDetailDeliveryPage(webDriver);
        AddDetailDelivery.withTheData(webDriver,product);
        AddPayment.isVisibleIsPaymentPage(webDriver);
        AddPayment.withTheData(webDriver,product);
        ViewAlert.isVisibleIsDeliveryPage(webDriver);

        Assert.assertEquals(ViewAlert.getTextAlert(webDriver),product.getAlert());

    }

    @DataProvider(name="productDataProvider")
    public Object[] googleDataProvider() throws FileNotFoundException {
        return JsonTestDataHelper.getInstance().geTestData(productTestDataPath + "productData.json", Product.class);
    }
}
