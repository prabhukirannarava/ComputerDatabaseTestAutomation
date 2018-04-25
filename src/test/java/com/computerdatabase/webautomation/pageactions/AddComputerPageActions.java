package com.computerdatabase.webautomation.pageactions;

import com.computerdatabase.webautomation.pageobjects.AddComputerPage;
import net.thucydides.core.annotations.Step;


public class AddComputerPageActions {

    private AddComputerPage addComputerPage;

    @Step
    public boolean isAddComputerPageOpened() {
        return addComputerPage.isCreateComputerBtnExists();
    }

    @Step
    public void fillInComputerName(String computername) {
        addComputerPage.fillinComputerName(computername);
    }

    @Step
    public void fillInIntroducedDate(String introduceddate) {
        addComputerPage.fillinIntroducedDate(introduceddate);
    }

    @Step
    public void fillInDiscontinuedDate(String discontinuedDate) {
        addComputerPage.fillinDiscontinuedDate(discontinuedDate);
    }

    @Step
    public void selectCompanyFromDropDown(String companyname) {
        addComputerPage.selectCompanyName(companyname);
    }

    @Step
    public void clickOnCreateComputerBtn() {
        addComputerPage.clickOnCreateComputerButton();
    }
}
