package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepDefinition {
    HerokuPage herokuPage=new HerokuPage();
    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        herokuPage.addElementButton.click();
    }
    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuPage.deleteButton));
        //Reusable ile
        // ReusableMethods.waitForVisibility(herokuPages.deleteButton,10);
    }
    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        assert herokuPage.deleteButton.isDisplayed();
        //Bu sekilde de kullanilabiliyor
        //herokuPages.deleteButton.isDisplayed() sonuna nokta koyarsak
        // yukardaki sekilde de assert kullanimini assert true olarak kullanabiliriz
        //Eger assert equals kullanacaksak   assert herokuPages.addRemovesElementsText.getText().equals("Add/Remove Elements");
        // bu method sekli sadece true / onune unlem koyarsak false seklinde kullanilir
        // Assert.assertTrue(herokuPages.deleteButton.isDisplayed());
    }
    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herokuPage.deleteButton.click();
    }
    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        assert !herokuPage.deleteButton.isDisplayed();
        //Assert.assertFalse(herokuPages.deleteButton.isDisplayed());
    }
    @And("AddRemove Elements yazisinin gorunurlugunu test eder")
    public void addremoveElementsYazisininGorunurlugunuTestEder() {
        assert herokuPage.addRemovesElementsText.getText().equals("Add/Remove Elements");
    }

    @Given("User goes to direct {string}")
    public void userGoesToDirect(String arg0) {
    }

    @And("User waits {int} second")
    public void userWaitsSecond(int arg0) {
    }

    @And("User close browser")
    public void userCloseBrowser() {
    }
}
