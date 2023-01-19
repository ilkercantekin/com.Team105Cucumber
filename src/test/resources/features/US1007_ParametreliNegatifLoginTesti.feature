
  Feature: US1007 Kullanici yanlis bilgilerle giris yapamaz

    Scenario: TC13 Gecerli kullanici adi ve gecersiz sifre ile Negative Login Testi

      Given kullanici "qdUrl" ana sayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecerliUsername" yazar
      And password kutusuna "qdGecersizPassword" yazar
      Then login butonuna basar
      And basarili giris yapilamadigini test eder
      And 3 saniye bekler
      Then sayfayi kapatir

    Scenario: TC14 Gecersiz kullanici adi ve gecerli sifre ile Negatif Login Testi

      Given kullanici "qdUrl" ana sayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And password kutusuna "qdGecerliPassword" yazar
      Then login butonuna basar
      And basarili giris yapilamadigini test eder
      And 3 saniye bekler
      Then sayfayi kapatir

    Scenario: TC15 Gecersiz kullanici adi ve Gecersiz sifre ile Pozitif Login Testi

      Given kullanici "qdUrl" ana sayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And password kutusuna "qdGecersizPassword" yazar
      Then login butonuna basar
      And basarili giris yapilamadigini test eder
      And 3 saniye bekler
      Then sayfayi kapatir