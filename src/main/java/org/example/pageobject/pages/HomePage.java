package org.example.pageobject.pages;

import org.example.pageobject.BasePage;
import org.example.pageobject.modules.DeliverLocationPopUpModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"glow-ingress-block\"]")
    private WebElement deliverLocationDropDownModule;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    private WebElement searchInputField;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"glow-ingress-line2\"]")
    private WebElement currentZipCode;
    @FindBy(xpath = "//*[@id=\"glow-ingress-block\"]")
    private WebElement currentCountry;
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage open() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.get("https://www.amazon.com/");
        return this;
    }
    public String getCurrentZipCode(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return currentZipCode.getText();
    }
    public DeliverLocationPopUpModule openProfileDropDown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webDriverWait.until(ExpectedConditions.visibilityOf(deliverLocationDropDownModule)).click();
        return new DeliverLocationPopUpModule(webDriver);
    }
    public String getCurrentCountry(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return currentCountry.getText();
    }
    /*
    WebElement countryPoland = new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[contains(text(),'" + poland + "')]")));
            countryPoland.click();
     */
    public SearchResultPage searchOnSearchFieldByData(String searchData) {
        webDriverWait.until(ExpectedConditions.visibilityOf(searchInputField)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriverWait.until(ExpectedConditions.visibilityOf(searchInputField)).sendKeys(searchData);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriverWait.until(ExpectedConditions.visibilityOf(searchButton)).click();
        return new SearchResultPage(webDriver);
    }
}