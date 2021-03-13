package web.steps;

import net.thucydides.core.annotations.Step;
import org.testng.Assert;
import web.pages.SignInPage;
import web.pages.SignUpPage;

public class SignUpSteps {
    SignUpPage signUp;

    @Step
    public void openPage() {
        signUp.open();
    }

    @Step
    public void selectPersonal() {
        signUp.personalRadioButton.waitUntilClickable();
        signUp.personalRadioButton.click();
    }

    @Step
    public void clickContinue() {
        signUp.continueButton.waitUntilClickable();
        signUp.continueButton.click();
    }

    @Step
    public void inputFirstName() {
        signUp.input.sendKeys("Cosmin");
    }

    @Step
    public void inputLastName() {
        signUp.input.sendKeys("Ranf");
    }

    @Step
    public void inputEmail(String email) {
        signUp.input.sendKeys(email);
    }

    @Step
    public void verifyErrorMessage() {
        Assert.assertEquals(signUp.emailInUseMessage.getText(), "e-mail address is already in use");
    }
}
