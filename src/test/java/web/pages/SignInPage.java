package web.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class SignInPage extends PageObject {

    @FindBy(xpath = "//a[@data-test-id='sign-up-link']")
    public WebElementFacade signUpLink;

    @FindBy(xpath = "//input[@placeholder='Enter your email']")
    public WebElementFacade emailInput;

    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    public WebElementFacade passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade logInButton;

    @FindBy(xpath = "//html[@style='overflow-y: auto;']")
    public WebElementFacade homePage;

    @FindBy(xpath = "//span[@aria-controls='simple-menu']")
    public WebElementFacade homePageTitle;
    }

