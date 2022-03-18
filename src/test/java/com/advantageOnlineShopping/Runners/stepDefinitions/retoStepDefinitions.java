package com.advantageOnlineShopping.Runners.stepDefinitions;


import Step.registroSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class retoStepDefinitions {
    @Steps
    registroSteps registroSteps;

    @Given("^Jorse is on the portal web$")
    public void jSeEncuentraEnElPortalWeb() {
        registroSteps.abrirNavegador();
    }

    @When("^Jorse enters the data for you registration$")
    public void jorseEntersTheDataForYouRegistration() throws IOException {
        registroSteps.clicbtnSignin();
        registroSteps.clicbtnCreateNewAccount();
        registroSteps.registerNewUser();
        registroSteps.clicbtnRegister();
    }


    @Then("^Jorse is inside the portal web$")
    public void jorseIsInsideThePortalWeb() {

    }
}
