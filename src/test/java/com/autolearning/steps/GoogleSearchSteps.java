package com.autolearning.steps;

import com.autolearning.StepsContext;
import com.autolearning.pages.GoogleSearchPage;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class GoogleSearchSteps extends StepsContext {

    @Autowired
    GoogleSearchPage googleSearchPage;


    @Given("^I navigate to google$")
    public void iNavigateToGoogle() {
        googleSearchPage.navigateToBasePage();
    }

}
