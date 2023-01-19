Feature: Us1008 Scenario Outline ile birden fazla data icin test calistirma

  Scenario Outline: TC16 Scenario outline ile amazonda arama yapilabilmeli

    # Amazon anasyfaya gidelim. Nutella,Java Samsung ve Apple icin arama yapip
    # arama sonuclarinin aradigimiz kelimeyi icerdigini test edelim
    Given kullanici "amazonUrl" ana sayfaya gider
    Then amazon arama kutusuna "<arananurun>" yazip aratir
    Then arama sonuclarinin "<arananurun>" icerdigini test eder
    And sayfayi kapatir

    Examples:
    |arananurun|
    |Nutella   |
    |Java      |
    |Samsung   |
    |Apple     |
