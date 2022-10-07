package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags="@All", // iki tag'i ayni anda calistirmak istersek "@group1 or group2" seklinde yazariz.
        dryRun = false
)




public class Runner {
    /*
    Runner class'i  TestNG'deki xml mantigi ile calisir. Calistirmak istedigimiz senaryolara
    tag belirtiriz ve belirttigimiz tag'lari calistirir. XML'deki gibi istedigimiz testleri calistirmak icin kullaniriz.
    Runner class body'si bostur ve runner class'ini ekleyecegimiz notasyonlar aktive eder.
    Bu class'da kullanacagimiz 2 adet notsyon vardir.
        1-)  @RunnerWith(cucumber.class) notasyonu Runner class'ina calisma ozelligi ekler.
        Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ederiz.
        2-)  @CucumberOptions notasyonu icinde;
        features: Runner dosyasinin feature dosyasini nereden bulacagini tarif eder
        glue : stepDefinitions yolunu belirtiriz
        tags: Hangi tag'i calistirmak istersek eonu belli eder.

        dryRun : iki secenek vardir
        dryRun=True ; dersek testimizi calistirmadan eksik adimlari bize verir
        dryRun=false; teslerimizi drive ile calistirir.
     */

}
