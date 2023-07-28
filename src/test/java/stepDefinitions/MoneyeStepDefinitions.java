package stepDefinitions;

import Pages.MoneyePages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class MoneyeStepDefinitions {
    MoneyePages moneyePages = new MoneyePages(DriverFactory.getDriver());
    @When("Hemen Basla butonuna tiklanir")
    public void hemenBaslaButonunaTiklanir() throws InterruptedException {
        moneyePages.hemenBaslaButonunaTiklanir();

    }

    @When("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {
        moneyePages.girisYapButonunaTiklanir();

    }

    @When("Kullanici adi sifre yazilir")
    public void kullaniciAdiSifreYazilir() {
        moneyePages.kullaniciAdiSifreYazilir();

    }




    @When("Journey sayfasina gidilir")
    public void journeySayfasinaGidilir() {
        moneyePages.journeySayfasinaGidilir();


    }

    @When("Istek mi Ihtiyac mi Journeysine tiklanir")
    public void ıstekMiIhtiyacMiJourneysineTiklanir() {
        moneyePages.istekmiIhtiyacMiJourneysineTiklanir();


    }

    @When("Basla butonuna tiklanir")
    public void baslaButonunaTiklanir() {
        moneyePages.baslaButonunaTiklanir();

    }

    @Then("Journeynin acildigi kontrol edilir")
    public void journeyninAcildigiKontrolEdilir() {
        moneyePages.journeyninAcildigiKontrolEdilir();

    }
}
