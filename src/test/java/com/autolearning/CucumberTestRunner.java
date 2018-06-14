package com.autolearning;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber/output/myauto"},
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features",
        glue = "com.autolearning.steps",
        tags = "@Olx"
)
public class CucumberTestRunner {
}
