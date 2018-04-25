package com.computerdatabase.webautomation.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class EditComputerPage extends PageObject {


    @FindBy(id = "name")
    WebElementFacade computername;

    @FindBy(id = "introduced")
    WebElementFacade introducedDate;

    @FindBy(id = "discontinued")
    WebElementFacade discontinueddate;

    @FindBy(id = "company")
    WebElementFacade companyname;

    @FindBy(xpath = "//input[@value='Save this computer']")
    WebElementFacade savecomputerbtn;

    @FindBy(xpath = "//input[@value='Delete this computer']")
    WebElementFacade deletecomputerbtn;

    public boolean isSaveComputerBtnExists() {
        return savecomputerbtn.isPresent();
    }

    public void clickOnSaveComputerButton() {
        savecomputerbtn.waitUntilClickable();
        savecomputerbtn.click();
    }

    public void fillinComputerName(String name) {
        computername.type(name);
    }

    public void fillinIntroducedDate(String date) {
        introducedDate.type(date);
    }

    public void fillinDiscontinuedDate(String date) {
        discontinueddate.type(date);
    }

    public void selectCompanyName(String company) {
        companyname.click();
        companyname.selectByVisibleText(company);
    }

    public void clickOnDeleteComputerButton() {
        deletecomputerbtn.waitUntilClickable();
        deletecomputerbtn.click();
    }
}