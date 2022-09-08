package org.example.stepdefinition;

import io.cucumber.java.en.And;
import org.example.pageobject.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DelivToFunctSteps {

    public HomePage homePage;
    public String poland = "Poland";
    public String zip = "90210";

    /*
    Scenario: zip code 90210 is present
    Given User is on Home Page
    When User opens the Deliver icon
    And In opened pop up User enters zipcode as "90210"
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
*/

    @And("In opened pop up User enters zipcode as 90210")
    public void testDeliveryZipCode() {

    }


    @Test
    public void testDeliverCountryPoland() {
        boolean  isDeliveredCountryPoland =  homePage.open().openProfileDropDown()
                .inputPostalCodeInDropdownModuleAndClickApplyButton(zip)
                .openProfileDropDown().
                chooseDeliverLocationAsPolandAndClickDoneButton().searchOnSearchFieldByData("headphones").selectAnyProductOnSearchResultPage().getDeliveryCountry().contains("Poland");
        Assert.assertEquals(true,isDeliveredCountryPoland);
    }

}