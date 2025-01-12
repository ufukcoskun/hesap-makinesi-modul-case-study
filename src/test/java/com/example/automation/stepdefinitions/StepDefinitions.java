package com.example.automation.stepdefinitions;

import com.example.automation.pages.HesaplamaPage;
import com.example.automation.pages.HomePage;
import com.example.automation.util.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class StepDefinitions {

    private WebDriver driver;
    private HomePage homePage;
    private HesaplamaPage hesaplamaPage;


    @Given("Hesaplama Modülü sayfası açılır")
    public void hesaplama_modul_sayfası_acilis() {
        driver = WebDriverFactory.getDriver();
        driver.get("https://wwww.abchesaplamamodulu.com");
        hesaplamaPage = new HesaplamaPage(driver);
    }

    @When("Yatırım tutarı alanına tıklanır")
    public void yatirim_tutari_tiklama() {
        hesaplamaPage.yatirimTutarTik();
    }

    @When("Yatırım tutarı {string} TL olarak girilir")
    public void yatirim_tutari_giris(String query) {
        hesaplamaPage.yatirimTutar(query);
    }

    @When("Faiz oranı alanına tıklanır")
    public void faiz_orani_tiklama() {
        hesaplamaPage.faizOraniTik();
    }

    @When("Faiz oranı %{string} olarak girilir")
    public void faiz_orani_giris(String faiz) {
        hesaplamaPage.faizOrani(faiz);
    }

    @When("Süre alanına tıklanır")
    public void sure_tiklama() {
        hesaplamaPage.sureGirisTik();
    }

    @When("Süre {string} ay olarak girilir")
    public void sure_giris(String sure) {
        hesaplamaPage.sureGiris(sure);
    }

    @When("Hesapla butonuna tıklanır")
    public void hesapla_buton_tik() {
        hesaplamaPage.hesaplaButtonClick();
    }

    @When("Kısa vadeli yatırım sonucu {string} TL olarak görülür")
    public void sonuc_gor(String query) {
        String sonuc = hesaplamaPage.sonucYakala();
        assertEquals(sonuc, query);
    }

    @When("Yıllık yatırım tutarı alanına tıklanır")
    public void yillik_yatirim_tutari_tiklama() {
        hesaplamaPage.yillikYatirimTutarTik();
    }

    @When("Yıllık yatırım tutarı {string} TL olarak girilir")
    public void yillik_yatirim_tutari_giris(String yilliktutar) {
        hesaplamaPage.yillikYatirimTutar(yilliktutar);
    }

    @When("Yıllık faiz oranı alanına tıklanır")
    public void yillik_faiz_orani_tiklama() {
        hesaplamaPage.yillikFaizOraniTik();
    }

    @When("Yıllık faiz oranı %{string} olarak girilir")
    public void yillik_faiz_orani_giris(String yillikfaiz) {
        hesaplamaPage.yillikFaizOrani(yillikfaiz);
    }

    @When("Yıllık yatırım sonucu {string} TL olarak görülür")
    public void yillik_sonuc_gor(String query) {
        String sonuc = hesaplamaPage.yillikSonucYakala();
        assertEquals(sonuc, query);
    }

    @When("user searches for {string}")
    public void user_searches_for(String query) {
        homePage.search(query);
    }

    @Then("the search results should be displayed")
    public void search_results_should_be_displayed() {
        // Add assertions to verify search results
        assertTrue("Search results are not displayed", true); // Example placeholder
        driver.quit();
    }
}