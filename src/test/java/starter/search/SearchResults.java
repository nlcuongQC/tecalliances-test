package starter.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.GoogleSearchResultsPage;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResults extends UIInteractionSteps {

    @Step
    public void isContains(String result) {
        List<String> results =
                $$(GoogleSearchResultsPage.SEARCH_RESULTS).stream().map(WebElementFacade::getText).collect(Collectors.toList());
        assertThat(results).contains(result);
    }
}
