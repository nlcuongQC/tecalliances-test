package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class GoogleHomePage extends PageObject {

    public static final By SEARCH_TXTBX = By.cssSelector("[name = 'q']");

}
