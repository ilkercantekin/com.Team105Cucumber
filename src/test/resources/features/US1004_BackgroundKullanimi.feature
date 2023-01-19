
Feature: US1004 Kullanici bastaki ortak adimlar icin Background kullanir

  Background: Tum scnario'lar icin ortak ilk adim
    Given kullanici amazon ana sayfaya gider
    @p2
  Scenario: TC06 Kullanici Parametreli metod ile Nutella aratir


    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC07 Kullanici parametreli method ile Java aratir



    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And 5 saniye bekler
    And sayfayi kapatir

  Scenario: TC08 Kullanici parametreli method ile Samsung aratir



    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin "Samsung" icerdigini test eder
    And sayfayi kapatir