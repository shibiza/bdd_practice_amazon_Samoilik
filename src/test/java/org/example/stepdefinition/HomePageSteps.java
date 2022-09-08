package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.HomePage;
import org.testng.Assert;

import static org.example.stepdefinition.BaseSteps.webDriver;

public class HomePageSteps {

    HomePage homePage = new HomePage(webDriver);
/*
  Scenario: zip code 90210 is present
    Given User is on Home Page
    When User opens the Deliver icon
    And In opened pop up User enters zipcode as 90210
    Then User sees the possibility to delivery to 90210

  Scenario: the value is updated.
    Given User is on Home Page
    When User opens the Deliver icon
    And In opened pop up User choose country Poland
    Then User sees Poland country is presented


  Scenario: shipping item to Poland.
    Given User is on Home Page
    When User opens the Deliver icon
    And In opened pop up User choose country Poland
    And User choose headset and click
    Then Shipping to Poland is possible

    @Given("User is on Index Page")
    public void userIsOnIndexPage(){
        indexPage.openIndexPage();
    }

    @When("User opens Gaming Keyboards Category Page")
    public void userOpensGamingCategoryPage(){
        indexPage.openGamingKeyboardsPage();
    }
}

*/

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        homePage.open();
    }

    @When("User opens the Deliver icon")
    public void UserOpensTheDeliverIcon() {
        homePage.openProfileDropDown();
    }


}