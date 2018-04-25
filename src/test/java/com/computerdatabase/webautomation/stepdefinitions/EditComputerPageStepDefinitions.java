package com.computerdatabase.webautomation.stepdefinitions;

import com.computerdatabase.webautomation.pageactions.EditComputerPageActions;
import com.computerdatabase.webautomation.pageactions.HomePageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;

public class EditComputerPageStepDefinitions {

    @Steps
    EditComputerPageActions editComputerPageActions;
    HomePageActions homePageActions;

    @When("^\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", are edited$")
    public void computer_details_are_edited(String introdate, String discodate, String companyname) throws Throwable {
        editComputerPageActions.UpdateIntroducedDate(introdate);
        editComputerPageActions.UpdateDiscontinuedDate(discodate);
        editComputerPageActions.UpdateCompanyFromDropDown(companyname);
        editComputerPageActions.clickOnSaveBtn();
    }

    @Then("^the details of that computer should be updated$")
    public void the_details_of_that_computer_should_be_updated() throws Throwable {
        assertEquals(true, editComputerPageActions.isUpdateSuccessful());
    }

    @When("^user clicks on delete button$")
    public void user_clicks_on_delete_button() throws Throwable {
        editComputerPageActions.clickOnDeleteBtn();
    }
}
