@All
Feature: Amazon Search

  @group1
  Scenario: TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon anasayfasina gider
    Then Kullanici nutella aratir
    And Sonuclarin nutella icerdigini test eder
    And Sayfayi kapatir


@group3
  Scenario: TC02 Kullanici amazonda Selenium aratir

    Given Kullanici amazon anasayfasina gider
    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder
    And Sayfayi kapatir

  @group2
  Scenario: TC03 Kullanici amazonda iphone aratir

    Given Kullanici amazon anasayfasina gider
    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir