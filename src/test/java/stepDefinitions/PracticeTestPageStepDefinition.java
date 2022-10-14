package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefinition {

    PracticeTestPage practiceTestPage=new PracticeTestPage();
    Actions actions=new Actions(Driver.getDriver());
    int down32Toplam;
    int clickTextToplam;
    int sonuc;
    @Given("{string} adresine gidin")
    public void adresineGidin(String url) {
        Driver.getDriver().get(url);
    }

    @Given("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(Integer int1) {
        for (int i = 0; i <=int1 ; i++) {
            practiceTestPage.clickButton.click();

        }
    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(Integer int1) {
       // practiceTestPage.clickButton.sendKeys(Keys.SPACE);
        for (int i = 0; i <int1 ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
        List<WebElement> down32=practiceTestPage.down32;

        for (WebElement w: down32  ) {

           down32Toplam+=Integer.parseInt(w.getText().replaceAll("[^0-9]",""));
        }
        System.out.println("down32 toplami: "+down32Toplam);

    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
       List <WebElement> clickText=practiceTestPage.clickText;
        for (WebElement w:clickText       ) {
          clickTextToplam+=  w.getText().length();
        }
        sonuc =down32Toplam-clickTextToplam;
        System.out.println("sonuc : " + sonuc);
    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int result) {
        Assert.assertEquals("sonuc esit degil ", result,sonuc );
    }
}
