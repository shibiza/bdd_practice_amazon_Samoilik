package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static org.example.stepdefinition.BaseSteps.webDriver;

public class HomePageSteps {

    @Then("User is successfully navigated to the {string}")
    public void userIsNavigatedToPage(String url) {
        Assert.assertEquals(url, webDriver.getCurrentUrl(),
                "Urls are not the same");

    }


    @And("User info {string} on {string} is present on navigation panel")
    public void userInfoOnIsPresentOnNavigationPanel(String userName, String pageName) {
    }
}