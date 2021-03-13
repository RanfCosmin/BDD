package web.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import web.pages.SignInPage;

public class SignInSteps {
    SignInPage signIn;

    @Step
    public void openPage() {
        signIn.open();
    }

    @Step
    public void clickSignUp() {
        signIn.signUpLink.waitUntilClickable();
        signIn.signUpLink.click();
    }

    @Step
    public void inputEmail() {
        signIn.emailInput.sendKeys("ranfcosmin456@gmail.com");
    }

    @Step
    public void inputPassword() {
        signIn.passwordInput.sendKeys("Darius456.");
    }

    @Step
    public void logInButton() {
        signIn.logInButton.waitUntilClickable();
        signIn.logInButton.click();
    }

    @Step
    public void homePage() {
        Assert.assertEquals(signIn.homePage.containsElements("//span[@aria-controls='simple-menu']"), true);
    }
}
