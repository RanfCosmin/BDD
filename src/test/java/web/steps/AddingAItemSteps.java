package web.steps;

import net.thucydides.core.annotations.Step;
import org.testng.Assert;
import web.LogInCapabilityRunner;
import web.pages.AddingAItem;

public class AddingAItemSteps {

    AddingAItem addAItem;

    @Step
    public void addItem() {
        addAItem.addItem.waitUntilClickable();
        addAItem.addItem.click();
    }

    @Step
    public void itemButton() {
        addAItem.itemButton.waitUntilClickable();
        addAItem.itemButton.click();
    }

    @Step
    public void myRecord() {
        addAItem.oneOfMyRecords.waitUntilClickable();
        addAItem.oneOfMyRecords.click();
    }

    @Step
    public void inputItem() {
        addAItem.itemTyping.sendKeys("Computer");
    }

    @Step
    public void continueButton() {
        addAItem.continueButton.waitUntilClickable();
        addAItem.continueButton.click();
    }

    @Step
    public void submitButton() {
        addAItem.continueButton.waitUntilClickable();
        addAItem.continueButton.click();
    }

    @Step
    public void nickName() {
        addAItem.input.sendKeys("Lenovo");
    }

    @Step
    public void continueNick() {
        addAItem.continueButton.waitUntilClickable();
        addAItem.continueButton.click();
    }

    @Step
    public void continueWithoutALocation() {
        addAItem.continueButton.waitUntilClickable();
        addAItem.continueButton.click();
    }

    @Step
    public void makeInput() {
        addAItem.make.sendKeys("Lenovo");
    }

    @Step
    public void modelInput() {
        addAItem.model.sendKeys("430");
    }

    @Step
    public void serialInput() {
        addAItem.serial.sendKeys("123456789");
    }

    @Step
    public void datePurchasedInput() {
        addAItem.datePurchased.sendKeys("12/12/20");
    }

    @Step
    public void purchasePriceInput() {
        addAItem.purchasePrice.sendKeys("500");
    }

    @Step
    public void warrantyInput() {
        addAItem.warrantyExpirationDate.sendKeys("12/12/25");
    }

    @Step
    public void saveItemButton() {
        addAItem.saveItem.waitUntilClickable();
        addAItem.saveItem.click();
    }

    @Step
    public void successMessage() {
        Assert.assertEquals(addAItem.successMessage.getText(), "Your Item was added successfully!");
    }


}
