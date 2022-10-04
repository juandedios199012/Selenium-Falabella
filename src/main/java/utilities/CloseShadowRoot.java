package utilities;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.home.HomePage;

public class CloseShadowRoot {

    public static void onClickClose(WebDriver webDriver){
        WaitUntilElement.isVisibility(webDriver, HomePage.SHADOW_ROOT);
        Click.onClickShadowRootElement(webDriver,HomePage.SHADOW_ROOT,HomePage.BUTTON_SHADOW_ROOT);
    }
}
