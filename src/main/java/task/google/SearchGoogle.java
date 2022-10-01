package task.google;

import actions.Click;
import actions.Enter;
import model.google.Google;
import org.openqa.selenium.WebDriver;
import pages.google.GoogleSearchPage;

public class SearchGoogle {

    public static void withTheData(WebDriver webDriver, Google google){
        Enter.textWitEnter(webDriver, GoogleSearchPage.inputSearch, google.getWord());
        Click.on(webDriver, GoogleSearchPage.linkFalabella);
    }


}
