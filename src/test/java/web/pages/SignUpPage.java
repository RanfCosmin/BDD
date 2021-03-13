package web.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignUpPage extends PageObject {

    @FindBy(xpath = "//span[text()='PERSONAL']")
    public WebElementFacade personalRadioButton;

    @FindBy(xpath = "//span[text()='CONTINUE']")
    public WebElementFacade continueButton;

    @FindBy(xpath = "//input[@placeholder]")
    public WebElementFacade input;

 @FindBy(xpath = "//p[contains(text(),'in use')]")
    public WebElementFacade emailInUseMessage;

}
