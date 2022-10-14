package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guru=new GuruPage();
    @And("“Istenen Baslik” sutunundaki tum degerleri yazdirir")
    public void istenenBaslikSutunundakiTumDegerleriYazdirir(String baslik) {
        int index=0;
        for (int i = 0; i < guru.basliklar.size(); i++) {
            if(guru.basliklar.get(i).getText().equals(baslik)){
                System.out.println(guru.basliklar.get(i).getText());
                index=i+1;
                List<WebElement> sutunElement= Driver.getDriver()
                        .findElements(By.xpath("//tbody//tr//td["+index+"]"));
                sutunElement.forEach(t-> System.out.println(t.getText()));

            //    for (WebElement w:sutunElement     ) {
               // System.out.println(w.getText());
             //   }

            }

        }

    }


    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String arg0) {
    }

    @Given("sayfayi kapatir")
    public void sayfayiKapatir() {
    }
}
