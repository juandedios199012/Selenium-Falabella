package google;

import base.BaseTest;
import helper.JsonTestDataHelper;
import model.google.Google;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import task.google.SearchGoogle;

import java.io.FileNotFoundException;
import java.util.Iterator;

public class GoogleTest extends BaseTest {

    public static String googleTestDataPath = "resource/testData/google/";

    @Test(dataProvider="googleDataProvider")
    public void testSearchWord(Google google){
        SearchGoogle.withTheData(webDriver, google);
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }

    @DataProvider(name="googleDataProvider")
    public Object[] googleDataProvider() throws FileNotFoundException {
        return JsonTestDataHelper.getInstance().geTestData(googleTestDataPath + "googleData.json", Google.class);
    }
}
