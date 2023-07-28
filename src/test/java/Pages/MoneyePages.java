package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class MoneyePages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By yolculugahemenbasla= MobileBy.AndroidUIAutomator("new UiSelector().text(\"Yolculuğuna hemen başla!\")");
    By devametbutonu= MobileBy.AndroidUIAutomator("new UiSelector().text(\"Devam et\")");
    By butceyecekiduzenverme= MobileBy.AndroidUIAutomator("new UiSelector().elementId(\"7dd56aa3-1f36-45de-a60b-089a3f66f2f4\")");



    public MoneyePages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);

    }

    public void hemenBaslaButonunaTiklanir() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(yolculugahemenbasla).click();
    }

    public void girisYapButonunaTiklanir() {
        driver.findElement(devametbutonu).click();

    }

    public void kullaniciAdiSifreYazilir() {

    }

    public void journeySayfasinaGidilir() {
    }

    public void istekmiIhtiyacMiJourneysineTiklanir() {
    }

    public void baslaButonunaTiklanir() {
    }

    public void journeyninAcildigiKontrolEdilir() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
