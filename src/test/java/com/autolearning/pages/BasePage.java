package com.autolearning.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class BasePage {

    @Autowired
    WebDriver driver;

    @Value("${application.url}")
    String rootUrl;


    public void navigateToBasePage() {
        driver.get(rootUrl);
    }


}
