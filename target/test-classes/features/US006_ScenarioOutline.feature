Feature: US006 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | sql           | sql                  |

    #TODO: TestNg'deki dataProvider kullanimindaki gibi Cucumber'da da Scenario Outline kullaniriz
    #TODO: Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz.

  #TODO : Feature dosyasinda yazdigimiz komutta eger "" (tirnak) kullanirsak stepDefinition'da parametreli
  #TODO : bir method olusturur ve artik stepDefinition'i kullanmadan Feature dosyasinda "" icindeki String'i
  #TODO: degistirerek istedigim kelimeyi aratabilirim. Scenario Outline da ise yine "" icinde birden fazla kelime
  #TODO: aratacaksam "<>" seklindeki kullanim ile "<>" icine yazdigim herhangibir kelimeyi Scenario Outline'in
  #TODO: asagida olusturdugu Eamples altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz.