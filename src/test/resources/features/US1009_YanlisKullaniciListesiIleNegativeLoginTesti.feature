Feature: Us1009Yanlis kullanici adi ve password listesi ile negatif login testi

  Scenario Outline: TC17 yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" ana sayfaya gider
    Then cookie cikarsa kabul eder
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And password kutusuna manuel olarak "<yanlisPassword>" yazar
    And 3 saniye bekler
    Then cookie cikarsa kabul eder
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir


    Examples:
    |yanlisUsername | yanlisPassword |
    |ilker           |ilker@a.com   |
    |mehmet          |mehmet@b.com  |
    |yasar           |yasar@c.com   |
    |Adem            |adem@d.com    |
    |ozgur           |ozgur@e.com   |
