package com.computerdatabase.webautomation.stepdefinitions;

import com.computerdatabase.webautomation.pageactions.AddComputerPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;


public class AddComputerPageStepDefinitions {

    @Steps
    private AddComputerPageActions addComputerPageActions;

    @Then("^Add Computer page should be opened$")
    public void add_Computer_page_should_be_opened() throws Throwable {
        assertEquals(true, addComputerPageActions.isAddComputerPageOpened());
    }

    @When("^User fills in \"([^\"]*)\"$")
    public void user_fills_in(String computername) throws Throwable {
        addComputerPageActions.fillInComputerName(computername);
    }

    @When("^Introduced Date is entered as \"([^\"]*)\"$")
    public void introduced_Date_is_entered_as(String introduceddate) throws Throwable {
        addComputerPageActions.fillInIntroducedDate(introduceddate);
    }

    @When("^Discontinued date is entered as \"([^\"]*)\"$")
    public void discontinued_date_is_entered_as(String discontinueddate) throws Throwable {
        addComputerPageActions.fillInDiscontinuedDate(discontinueddate);
    }

    @When("^Company name is selected as \"([^\"]*)\"$")
    public void company_name_is_selected_as(String companyname) throws Throwable {
        addComputerPageActions.selectCompanyFromDropDown(companyname);
    }

    @When("^User clicks on Create this computer Button$")
    public void user_clicks_on_Create_this_computer_Button() throws Throwable {
        addComputerPageActions.clickOnCreateComputerBtn();
    }
}
