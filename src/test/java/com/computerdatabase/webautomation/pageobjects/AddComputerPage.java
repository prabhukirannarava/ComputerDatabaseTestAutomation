package com.computerdatabase.webautomation.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AddComputerPage extends PageObject {

    @FindBy(xpath = "//input[@type='submit']")
    WebElementFacade createcomputerbtn;

    @FindBy(id = "name")
    WebElementFacade computername;

    @FindBy(id = "introduced")
    WebElementFacade introducedDate;

    @FindBy(id = "discontinued")
    WebElementFacade discontinueddate;

    @FindBy(id = "company")
    WebElementFacade companyname;

    public boolean isCreateComputerBtnExists() {
        return createcomputerbtn.isPresent();
    }

    public void clickOnCreateComputerButton() {
        createcomputerbtn.waitUntilClickable();
        createcomputerbtn.click();
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
}
