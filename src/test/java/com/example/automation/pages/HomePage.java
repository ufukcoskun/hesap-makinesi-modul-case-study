package com.example.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void search(String query) {
        searchBox.sendKeys(query);
        searchButton.click();
    }
}