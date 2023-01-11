
Feature: US1001 kullanici amazonda test yapar

  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given Kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    Then sayfayi kapatir
