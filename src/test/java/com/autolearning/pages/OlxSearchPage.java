package com.autolearning.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class OlxSearchPage extends BasePage {

    private final By olxSearchBar = By.id("headerSearch");
    private final By olxSearchCity = By.id("cityField");
    private final By olxSearchButton = By.id("submit-searchmain");
    private final By olxCitySuggestion = By.id("autosuggest-geo-ul");
    private final By olxOrderGallery = By.id("order-select-gallery");


    public void searchForItem(String item) {
        fillInText(driver.findElement(olxSearchBar), item);
    }

    public void searchInCity(String city) {
        fillInText(driver.findElement(olxSearchCity), city);
    }

    public void clickSearchButton() {
        clickElement(driver.findElement(olxSearchButton));
    }

    public void checkSuggestions(String city) {
        waitForElementToContain(olxCitySuggestion, city, 10);
    }

    public void checkOrderGaleryIsDisplayed() {
        waitForElementToBePresentAndClickable(driver.findElement(olxOrderGallery), 10);
        checkElementIsDisplayed(driver.findElement(olxOrderGallery));
    }

}
