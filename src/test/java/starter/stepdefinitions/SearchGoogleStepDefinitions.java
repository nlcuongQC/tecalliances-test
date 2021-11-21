package starter.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResults;

public class SearchGoogleStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResults searchResult;

    @BeforeStory
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("John is on the Google home page")
    public void on_the_Google_home_page() {
        navigateTo.theGoogleHomePage();
    }

    @When("he searches for \"$keyword\"")
    public void search_for(String word) {
        searchFor.aWordIs(word);
    }

    @Then("the results should contain the word \"$keyword\"")
    public void all_the_result_titles_should_contain(String result) {
        searchResult.isContains(result);
    }
}
