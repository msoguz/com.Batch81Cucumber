@All
Feature: Amazon Search

  @group1
  Scenario: TC01 Kullanici amazonda nutella aratir

    Given kullanici amazon anasayfasina gider
    Then kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder
    And sayfayi kapatir


@group3
  Scenario: TC02 Kullanici amazonda Selenium aratir

    Given kullanici amazon anasayfasina gider
    Then kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder
    And sayfayi kapatir

  @group2
  Scenario: TC03 Kullanici amazonda iphone aratir

    Given kullanici amazon anasayfasina gider
    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir