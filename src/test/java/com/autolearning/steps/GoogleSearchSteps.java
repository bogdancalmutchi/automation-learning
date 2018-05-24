package com.autolearning.steps;

import com.autolearning.StepsContext;
import com.autolearning.pages.GoogleSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class GoogleSearchSteps extends StepsContext {

    @Autowired
    GoogleSearchPage googleSearchPage;


    @Given("^I navigate to google$")
    public void iNavigateToGoogle() {
        googleSearchPage.navigateToBasePage();
    }

    @And("^I type the word (.*) in$")
    public void iTypeTheWordFruitIn(String input) {
        googleSearchPage.searchForItem(input);
    }

    @When("^I click search$")
    public void iClickSearch() {
        googleSearchPage.pressEnterKey();
    }
}
