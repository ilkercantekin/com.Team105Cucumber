
Feature: US1005 Kullanici configuration.properties'de yazilan datalari parametre olarak kullanir
  # 3 Scenario olusturup, amazon,wisequarter ve walmart anasayfalarina gidin
  # ve o anasayfalara gittigimizi test edin
  # parametre olarak kullandigimiz kelimeler direk testte kullanilacak datalar olabilecegi gibi
  # configuration.properties'de bulunan key'ler de olabilir
  # Bu durumda stepdefinition'da yolladigimiz key ile
  # ConfigReader'daki getProperty() kullanilip
  # configuration.properties dosyasindaki value testte kullanilabilir
  Scenario: TC09 Kullanici amazon sitesine gidisi test eder
    Given kullanici "amazonUrl" ana sayfaya gider
    Then url de "amazon" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC10 Kullanici wisequarter sitesine gidisi test eder
    Given kullanici "wqUrl" ana sayfaya gider
    Then url de "wisequarter" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC11 Kullanici walmart sitesine gidisi test eder
    Given kullanici "walmartUrl" ana sayfaya gider
    Then url de "walmart" oldugunu test eder
    And sayfayi kapatir