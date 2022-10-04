package pages.google;

import org.openqa.selenium.By;

public class GoogleSearchPage {
    public static By INPUT_SEARCH = By.name("q");
    public static By LINK_FALABELLA = By.cssSelector("a[href='https://www.falabella.com.co/falabella-co']");

    /*inputSearch.sendKeys(word);

        inputSearch.sendKeys(Keys.ENTER);

    WebElement result = webDriver.findElement(By.id("result-stats"));
        System.out.println("La palabra " + word + " tiene " + result.getText());*/

}
