@Background
Feature: US001 Background Kullanimi


  Background: Ortak adimlar
    Given kullanici amazon anasayfasina gider



  Scenario: TC01 Kullanici amazonda nutella aratir

    Then kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder



  Scenario: TC02 Kullanici amazonda Selenium aratir

    Then kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder




  Scenario: TC03 Kullanici amazonda iphone aratir

    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir

