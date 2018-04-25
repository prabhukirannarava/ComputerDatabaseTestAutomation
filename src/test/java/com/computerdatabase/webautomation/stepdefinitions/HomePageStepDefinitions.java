package com.computerdatabase.webautomation.stepdefinitions;


import com.computerdatabase.webautomation.pageactions.HomePageActions;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;

public class HomePageStepDefinitions {

    @Steps
    HomePageActions homepagestep;

    @Given("^Computer database portal is open$")
    public void computer_database_portal_is_open() throws Throwable {
        homepagestep.launch();
    }

    @When("^User clicks on Add a new computer button$")
    public void user_clicks_on_Add_button() throws Throwable {
        homepagestep.clickAddButton();
    }

    @Then("^Create computer should \"([^\"]*)\" successful$")
    public void create_computer_should_successful(String result) throws Throwable {
        if (result.equalsIgnoreCase("Be")) {
            assertEquals(true, homepagestep.isAdditionOperationSuccessful("has been created"));
        } else {
            assertEquals(false, homepagestep.isAdditionOperationSuccessful("has been created"));
        }
    }

    @Given("^Computer database portal is open and atleast one computer details present on computer database portal$")
    public void computer_database_portal_is_open_and_atleast_one_computer_details_present_on_computer_database_portal() throws Throwable {
        homepagestep.launch();
        assertEquals(true, homepagestep.thereExistsOneComputer());

    }

    @When("^user clicks on a \"([^\"]*)\"$")
    public void user_clicks_on_a(String companyname) throws Throwable {
        homepagestep.clickOnComputerName(companyname);
    }

    @Then("^deletion should be successful and home page is shown$")
    public void deletion_should_be_successful_and_home_page_is_shown() throws Throwable {
        assertEquals(true, homepagestep.isDeletionSuccessful());
    }

    @When("^Computer name is entered as \"([^\"]*)\"$")
    public void computer_name_is_entered_as(String filteringText) throws Throwable {
        homepagestep.enterFilteringText(filteringText);
    }

    @When("^User clicks on fliterByName button$")
    public void user_clicks_on_fliterByName_button() throws Throwable {
        homepagestep.clickOnFilterButton();
    }

    @Then("^Filtering should \"([^\"]*)\" and home page should display \"([^\"]*)\" list\\.$")
    public void filtering_should_and_home_page_should_display_list(String result, String keyword) throws Throwable {
        if (result.equalsIgnoreCase("Success")) {
            assertEquals(true, homepagestep.validateComputerList(keyword));
        } else {
            assertEquals(false, homepagestep.validateComputerList(keyword));
        }

    }


}
