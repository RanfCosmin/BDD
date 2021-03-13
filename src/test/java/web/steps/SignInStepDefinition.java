package web.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignInStepDefinition {
    @Steps
    SignInSteps steps;

    @Given("I am on login page and click login")
    public void clickSignUp() {
        steps.openPage();
    }

    @When("I input an valid email and password")
    public void inputUserAndPassword() {
        steps.inputEmail();
        steps.inputPassword();
        steps.logInButton();
    }

    @Then("I am on home page")
    public void homePage() {
        steps.homePage();
    }
}
