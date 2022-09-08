package org.example.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.HomePage;
import org.example.pageobject.pages.LoginPage;

import static org.example.stepdefinition.BaseSteps.PAGES_STORAGE;
import static org.example.stepdefinition.BaseSteps.webDriver;

public class LoginPageSteps {

    // то что в кавычках в фичах (ресурсах в тестах) будет здесь аргументами
    @Given("User is on {string}")
    public void userIsOnPage(String pageName) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();

        PAGES_STORAGE.put(pageName, loginPage);
    }

    @When("User enters username as {string} and password on {string}")
    public void userEntersUsernameAndPassword(String login, String pageName) {
        LoginPage loginPage = (LoginPage) PAGES_STORAGE.get(pageName);
        HomePage homePage = loginPage.login(login, "Priority100$");

        PAGES_STORAGE.put("Home Page", homePage);
    }



}