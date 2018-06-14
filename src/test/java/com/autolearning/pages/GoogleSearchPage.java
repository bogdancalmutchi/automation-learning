package com.autolearning.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearchPage extends BasePage {

    private final By searchBarField = By.id("lst-ib");
    private final By searchButton = By.xpath("//input[@value = 'Google Search' and @type='submit']");

    public void searchForItem(String item) {
        fillInText(driver.findElement(searchBarField), item);
    }

    public void pressEnterKey() {
        pressEnter(driver.findElement(searchBarField));
    }

}
