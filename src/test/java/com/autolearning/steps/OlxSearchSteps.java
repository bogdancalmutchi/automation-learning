package com.autolearning.steps;

import com.autolearning.StepsContext;
import com.autolearning.pages.OlxSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class OlxSearchSteps extends StepsContext {
    
    @Autowired
    OlxSearchPage olxSearchPage;

    @Given("^I navigate to olx$")
    public void iNavigateToOlx()  {
        olxSearchPage.navigateToBasePage();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String item)  {
        olxSearchPage.searchForItem(item);
    }

    @And("^I search only in \"([^\"]*)\"$")
    public void iSearchOnlyIn(String city)  {
        olxSearchPage.searchInCity(city);
    }

    @And("^I click the search button$")
    public void iClickTheSearchButton() {
        olxSearchPage.clickSearchButton();
    }

    @Then("^The results are displayed$")
    public void theResultsAreDisplayed()  {
        olxSearchPage.checkOrderGaleryIsDisplayed();
    }

    @And("^The suggestions contain \"([^\"]*)\"$")
    public void theSuggestionsContain(String city) {
        olxSearchPage.checkSuggestions(city);
    }
}
