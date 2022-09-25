package google;

import base.BaseTest;
import org.testng.annotations.Test;
import task.google.SearchGoogle;

public class GoogleTest extends BaseTest {

    @Test
    public void testSearchWord(){
        SearchGoogle.withTheData(webDriver, "Falabella.co");
        //Assert.assertTrue(IsEmployeeSuccessAlert.visible(webDriver));
    }
}
