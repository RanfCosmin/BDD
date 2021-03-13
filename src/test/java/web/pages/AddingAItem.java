package web.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddingAItem extends PageObject {

    @FindBy(xpath = "//div[@data-test-id='add-flows-navigation-button']")
    public WebElementFacade addItem;

    @FindBy(xpath = "//span[text()='Item']")
    public WebElementFacade itemButton;

    @FindBy(xpath = "//span[text()='to one of my records']")
    public WebElementFacade oneOfMyRecords;

    @FindBy(xpath ="//input[@placeholder='Start typing...']")
    public WebElementFacade itemTyping;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade continueButton;

    @FindBy(xpath = "//input")
    public WebElementFacade input;

    @FindBy(xpath = "(//input)[1]")
    public WebElementFacade make;

    @FindBy(xpath = "(//input)[2]")
    public WebElementFacade model;

    @FindBy(xpath = "(//input)[3]")
    public WebElementFacade serial;

    @FindBy(xpath = "(//input)[4]")
    public WebElementFacade datePurchased;

    @FindBy(xpath = "(//input)[5]")
    public WebElementFacade purchasePrice;

    @FindBy(xpath = "(//input)[6]")
    public WebElementFacade warrantyExpirationDate;

    @FindBy(xpath = "//span[text()='Save Item']")
    public WebElementFacade saveItem;

    @FindBy(xpath = "//span[text()='Your Item was added successfully!']")
    public WebElementFacade successMessage;


}
