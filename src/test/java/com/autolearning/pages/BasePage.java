package com.autolearning.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;

public class BasePage {

    @Autowired
    WebDriver driver;

    @Value("${application.url}")
    String rootUrl;


    public void navigateToBasePage() {
        driver.get(rootUrl);
    }

    public void fillInText(WebElement element, String input) {
        element.sendKeys(input);
    }

    public void pressEnter(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void clearText(WebElement element) {
        element.clear();
    }


    private FluentWait<WebDriver> waitFor(int timeoutSeconds) {
        return new FluentWait<>(driver)
                .withTimeout(timeoutSeconds, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public void waitForElementToBePresentAndClickable(WebElement webElement, int timeoutSeconds) {
        waitFor(timeoutSeconds).until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement),
                ExpectedConditions.elementToBeClickable(webElement)));
    }

    public void waitForElementToContain(By webElement, String content, int timeoutSeconds) {
        waitFor(timeoutSeconds).until(ExpectedConditions.textToBePresentInElementLocated(webElement, content));
    }

    public boolean checkElementIsDisplayed(WebElement element) {
        return element.isDisplayed();
    }

}
