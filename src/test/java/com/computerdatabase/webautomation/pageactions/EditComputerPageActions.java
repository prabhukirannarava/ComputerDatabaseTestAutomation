package com.computerdatabase.webautomation.pageactions;

import com.computerdatabase.webautomation.pageobjects.EditComputerPage;
import com.computerdatabase.webautomation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class EditComputerPageActions {

    private EditComputerPage editComputerPage;
    private HomePage homePage;

    @Step
    public void UpdateComputerName(String computername) {
        editComputerPage.fillinComputerName(computername);
    }

    @Step
    public void UpdateIntroducedDate(String introduceddate) {
        editComputerPage.fillinIntroducedDate(introduceddate);
    }

    @Step
    public void UpdateDiscontinuedDate(String discontinuedDate) {
        editComputerPage.fillinDiscontinuedDate(discontinuedDate);
    }

    @Step
    public void UpdateCompanyFromDropDown(String companyname) {
        editComputerPage.selectCompanyName(companyname);
    }

    @Step
    public void clickOnSaveBtn() {
        editComputerPage.clickOnSaveComputerButton();
    }

    @Step
    public void clickOnDeleteBtn() {
        editComputerPage.clickOnDeleteComputerButton();
    }

    @Step
    public boolean isUpdateSuccessful() {
        return homePage.isUpdateSuccessful();
    }

}
