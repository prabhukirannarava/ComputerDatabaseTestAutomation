package com.computerdatabase.webautomation.pageactions;

import com.computerdatabase.webautomation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageActions {

    private HomePage homepage;

    @Step
    public void launch() {
        homepage.open();
        homepage.getDriver().manage().window().maximize();
    }

    @Step
    public void clickAddButton() {
        homepage.clickAddComputerButton();
    }

    @Step
    public boolean thereExistsOneComputer() {
        return homepage.isThereAlteastOneComputerExists();
    }

    @Step
    public boolean isAdditionOperationSuccessful(String computername) {
        return homepage.isAdditionOperationSuccessful(computername);
    }

    @Step
    public void clickOnComputerName(String companyname) {
        homepage.clickOnComputerName(companyname);
    }

    @Step
    public boolean isDeletionSuccessful() {
        return homepage.isDeletionOperationSuccessful();
    }

    @Step
    public void enterFilteringText(String companyName) {
        homepage.enterCompantNameInFilterBox(companyName);
    }

    @Step
    public void clickOnFilterButton() {
        homepage.clickOnFilterButton();
    }

    @Step
    public boolean validateComputerList(String keyword) {
        return homepage.validateComputerList(keyword);
    }
}
