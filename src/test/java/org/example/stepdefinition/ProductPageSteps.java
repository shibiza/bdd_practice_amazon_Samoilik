package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobject.pages.ProductPage;
import org.testng.Assert;

public class ProductPageSteps {
    ProductPage productPage = new ProductPage(BaseSteps.webDriver);

    @Then("Shipping to Poland is possible")
    public void shipping_to_poland_is_possible(){
        String deliveryCountry = productPage.getDeliveryCountry();
        boolean isDeliveryCountryPoland = deliveryCountry.contains("Poland");
        Assert.assertEquals(true,isDeliveryCountryPoland);
    }
}
