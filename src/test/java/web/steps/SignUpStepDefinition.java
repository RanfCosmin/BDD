package web.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignUpStepDefinition {
    @Steps
    SignUpSteps steps;

    @When("I input name and email (.+)$")
    public void existingEmail(String email) {
        steps.selectPersonal();
        steps.clickContinue();
        steps.inputFirstName();
        steps.clickContinue();
        steps.inputLastName();
        steps.clickContinue();
        steps.inputEmail(email);
        steps.clickContinue();
    }

    @Then("Error message is displayed")
        public void verifyMessage(){
            steps.verifyErrorMessage();
        }
    }
