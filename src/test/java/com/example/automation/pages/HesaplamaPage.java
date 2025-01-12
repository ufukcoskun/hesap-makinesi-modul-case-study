package com.example.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HesaplamaPage extends BasePage {

    @FindBy(id = "HesaplamaModuluHeader")
    private WebElement hesaplamaHeader;

    @FindBy(id = "HesaplamaButton")
    private WebElement hesaplamaButton;

    @FindBy(id = "YatirimTutariTextBox")
    private WebElement yatirimTutarTextBox;

    @FindBy(id = "FaizOraniTextBox")
    private WebElement faizOraniTextBox;

    @FindBy(id = "SureTextBox")
    private WebElement sureTextBox;

    @FindBy(id = "YatirimTutariArea")
    private WebElement yatirimTutarArea;

    @FindBy(id = "FaizOraniTextBox")
    private WebElement faizOraniTextArea;

    @FindBy(id = "SureTextBox")
    private WebElement sureTextArea;

    @FindBy(id = "SonucText")
    private WebElement sonucText;

    @FindBy(id = "YillikYatirimTutariTextBox")
    private WebElement yillikYatirimTutarTextBox;

    @FindBy(id = "YillikFaizOraniTextBox")
    private WebElement yillikFaizOraniTextBox;

    @FindBy(id = "YillikYatirimTutariArea")
    private WebElement yillikYatirimTutarArea;

    @FindBy(id = "YillikFaizOraniTextBox")
    private WebElement yillikFaizOraniTextArea;

    @FindBy(id = "YillikSonucText")
    private WebElement yillikSonucText;

    public HesaplamaPage(WebDriver driver) {super(driver);}

    public void yatirimTutar (String query){
        yatirimTutarTextBox.sendKeys(query);
    }

    public void faizOrani (String faiz){
        faizOraniTextBox.sendKeys(faiz);
    }

    public void sureGiris (String sure){
        sureTextBox.sendKeys(sure);
    }

    public void yatirimTutarTik () {
        yatirimTutarArea.click();
    }

    public void faizOraniTik (){
        faizOraniTextArea.click();
    }

    public void sureGirisTik (){
        sureTextArea.click();
    }

    public void hesaplaButtonClick (){
        hesaplamaButton.click();
    }

    public String sonucYakala (){
        sonucText.getText();
        return null;
    }

    public void yillikYatirimTutar (String yiilliktutar){
        yillikYatirimTutarTextBox.sendKeys(yiilliktutar);
    }

    public void yillikFaizOrani (String yillikfaiz){
        yillikFaizOraniTextBox.sendKeys(yillikfaiz);
    }

    public void yillikYatirimTutarTik () {
        yillikYatirimTutarArea.click();
    }

    public void yillikFaizOraniTik (){
        yillikFaizOraniTextArea.click();
    }

    public String yillikSonucYakala (){
        yillikSonucText.getText();
        return null;
    }

}
