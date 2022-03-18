package com.advantageOnlineShopping.Runners.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.advantageOnlineShopping/Reto.feature",
        glue = "com.advantageOnlineShopping.Runners.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)

public class retoRunner {

}
