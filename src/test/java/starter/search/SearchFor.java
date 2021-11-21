package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.GoogleHomePage;

public class SearchFor extends UIInteractionSteps {

    @Step
    public void aWordIs(String word) {
        $(GoogleHomePage.SEARCH_TXTBX).typeAndEnter(word);
    }

}
