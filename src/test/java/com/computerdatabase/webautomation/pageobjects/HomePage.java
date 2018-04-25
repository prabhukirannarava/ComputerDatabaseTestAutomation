package com.computerdatabase.webautomation.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("http://computer-database.herokuapp.com/computers")
public class HomePage extends PageObject {

    @FindBy(id = "add")
    WebElementFacade addcomputerbutton;

    @FindBy(id = "main")
    WebElementFacade mainheadertext;

    @FindBy(xpath = ".//div[contains(@class, 'alert-message warning')]")
    WebElementFacade operationresultmessage;

    @FindBy(xpath = ".//table[contains(@class, 'computers zebra-striped')]")
    WebElementFacade computerslist;

    @FindBy(id = "searchbox")
    WebElementFacade searchbox;

    @FindBy(id = "searchsubmit")
    WebElementFacade filterByName;

    public void clickAddComputerButton() {
        if (addcomputerbutton.isPresent() && addcomputerbutton.isCurrentlyEnabled()) {
            addcomputerbutton.waitUntilClickable();
            addcomputerbutton.click();
        }
    }

    public boolean isThereAlteastOneComputerExists() {
        return mainheadertext.getText().contains("computers found");
    }

    public boolean isUpdateSuccessful() {
        if (operationresultmessage.isPresent()) {
            return operationresultmessage.getText().contains("has been updated");
        } else {
            return false;
        }
    }

    public boolean isAdditionOperationSuccessful(String computername) {
        if (operationresultmessage.isPresent()) {
            return operationresultmessage.getText().contains(computername);
        } else {
            return false;
        }
    }

    public void clickOnComputerName(String computername) {
        computerslist.then(By.linkText(computername)).click();
    }

    public boolean isDeletionOperationSuccessful() {
        return mainheadertext.getText().contains("has been deleted");
    }

    public void enterCompantNameInFilterBox(String companyname) {
        searchbox.type(companyname);
    }

    public void clickOnFilterButton() {
        if (filterByName.isPresent()) {
            filterByName.click();
        }
    }

    public boolean validateComputerList(String keyword) {
        return computerslist.getText().contains(keyword);
    }

}
