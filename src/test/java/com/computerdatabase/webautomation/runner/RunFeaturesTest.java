/*
 * @author Prabhukiran Narava
 * 
 * Below annotations namely @Runwith and @CucumberOptions will trigger the entire test run.
 * 
 * 1. @Runwith will trigger the test run with cucumber using serenity.
 * 2. @CucumberOptions will take the features from location for test run.
 * 
 */
package com.computerdatabase.webautomation.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.computerdatabase.webautomation.stepdefinitions")
public class RunFeaturesTest {

} 