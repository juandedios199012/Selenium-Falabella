package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class GoogleSearchPage {
    public static By inputSearch = By.name("q");
    public static By linkFalabella=By.cssSelector("a[href='https://www.falabella.com.co/falabella-co']");

    /*inputSearch.sendKeys(word);

        inputSearch.sendKeys(Keys.ENTER);

    WebElement result = webDriver.findElement(By.id("result-stats"));
        System.out.println("La palabra " + word + " tiene " + result.getText());*/

}
