package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage= new AmazonPage();
    @Given("Kullanici amazon anasayfaya gider")
    public void kullaniciAmazonAnasayfayaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        amazonPage= new AmazonPage();
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }


    @Given("kullanici amazon ana sayfaya gider")
    public void kullaniciAmazonAnaSayfayaGider() {
        amazonPage= new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        amazonPage= new AmazonPage();
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazonAramaKutusunaSamsungYazipAratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung" + Keys.ENTER);
    }

    @And("arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        amazonPage= new AmazonPage();
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Samsung";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String aranacakKelime) {
        amazonPage= new AmazonPage();
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime=aranacakKelime;

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

    }

    @Given("kullanici {string} ana sayfaya gider")
    public void kullaniciAnaSayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananKelime));
    }


}