package org.example.stepdefinition;

import io.cucumber.java.en.And;
import org.example.pageobject.pages.SearchResultPage;

public class SearchResultPageSteps {
    SearchResultPage searchResultPage = new SearchResultPage(BaseSteps.webDriver);

    @And("Get search results")
    public void get_search_results(){
        searchResultPage.selectAnyProductOnSearchResultPage();
    }
}
