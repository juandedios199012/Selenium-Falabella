package task;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class CloseShadowRoot {

    public static void onClickClose(WebDriver webDriver){
        WaitUntilElement.isVisible(webDriver, HomePage.shadowRoot);
        WaitUntilElement.isVisible(webDriver, HomePage.buttonShadowRoot);
        Click.onClickShadowRootElement(webDriver,HomePage.shadowRoot,HomePage.buttonShadowRoot);
    }
}
