package utilities;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class CloseShadowRoot {

    public static void onClickClose(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, HomePage.SHADOW_ROOT);
        WaitUntilElement.isVisible(webDriver, HomePage.BUTTON_SHADOW_ROOT);
        Click.onClickShadowRootElement(webDriver,HomePage.SHADOW_ROOT,HomePage.BUTTON_SHADOW_ROOT);
    }
}
