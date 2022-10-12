package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ClassCalismasiPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ClassCalismasiStepDefinition {

    ClassCalismasiPage classCalismasiPage=new ClassCalismasiPage();
    Actions actions=new Actions(Driver.getDriver());


    @When("kullanici https:\\/\\/editor.datatables.net\\/ adresine gider")
    public void kullaniciHttpsEditorDatatablesNetAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("dataUrl"));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        classCalismasiPage.newButton.click();
    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstname) {
        classCalismasiPage.firstname.sendKeys(firstname);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
    }

    @And("position bolumune{string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String ofis) {
        actions.sendKeys(Keys.TAB).sendKeys(ofis).perform();
    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("startdate bolumune{string}  girer")
    public void startdateBolumuneGirer(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        classCalismasiPage.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(classCalismasiPage.isimVar.getText().contains(isim));
    }
}
