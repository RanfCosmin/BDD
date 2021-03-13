package web.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddingAItemStepDefinition {

    @Steps
    AddingAItemSteps itemSteps;

    @Given("I am on home page an click add a item")
    public void clickAddItem() {
        itemSteps.addItem();
    }

    @When("I input all criteria for adding a item")
    public void inputAllForItem() {
        itemSteps.itemButton();
        itemSteps.myRecord();
        itemSteps.inputItem();
        itemSteps.continueButton();
        itemSteps.submitButton();
        itemSteps.nickName();
        itemSteps.continueNick();
        itemSteps.continueWithoutALocation();
        itemSteps.makeInput();
        itemSteps.modelInput();
        itemSteps.serialInput();
        itemSteps.datePurchasedInput();
        itemSteps.purchasePriceInput();
        itemSteps.warrantyInput();
        itemSteps.saveItemButton();
    }

    @Then("I see an success message")
    public void successMessage() {
        itemSteps.successMessage();
    }
}
