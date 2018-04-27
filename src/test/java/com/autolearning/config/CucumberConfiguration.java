package com.autolearning.config;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.autolearning")
public class CucumberConfiguration {

    @Bean
    public WebDriver driver() {
        ChromeDriverManager.getInstance().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");

        WebDriver driver = new ChromeDriver(chromeOptions);

        return driver;
    }


}
