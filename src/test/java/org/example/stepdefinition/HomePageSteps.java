package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.HomePage;
import org.testng.Assert;

import static org.example.stepdefinition.BaseSteps.webDriver;

public class HomePageSteps {
    public String poland = "Poland";
    public String zip = "90210";
    HomePage homePage = new HomePage(webDriver);


    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        homePage.open();
    }

    @When("User opens the Deliver icon")
    public void user_opens_the_deliver_icon() {
        homePage.openProfileDropDown();
    }
    @Then("User sees the possibility to delivery to 90210")
    public void user_sees_the_possibility_to_delivery_to_90210(){
        String currentZipCode = homePage.getCurrentZipCode();
        boolean isZipCodeValide = currentZipCode.contains(zip);
        Assert.assertEquals(true,isZipCodeValide);
    }
    @Then("User sees Poland country is presented")
    public void user_sees_poland_country_is_presented(){
        String currentCountry = homePage.getCurrentCountry();
        System.out.println(currentCountry);
        boolean isValidCountry = currentCountry.contains(poland);
        Assert.assertEquals(true,isValidCountry);
    }
    @And("User choose headset and click")
    public void user_choose_headset_and_click(){
        homePage.searchOnSearchFieldByData("headphones");
    }
}