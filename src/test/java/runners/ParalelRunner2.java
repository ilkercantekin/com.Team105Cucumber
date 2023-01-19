package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports-p2.html",
                "json:target/json-reports/cucumberp2.json",
                "junit:target/xml-report/cucumberp2.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions"/* bazen sadece stepdefinitions yazinca calisiyor calismazsa ; src/test/java/stepdefinitions bunu dene */,
        tags = "@p2",
        dryRun = false
)
public class ParalelRunner2 {
    /*
    cucumber da runner classi bos bir classdir
    runner classini diger classlardan farkli kilan ve testNG deki xml dosyalari
    gibi calismasini saglayan 2 adet notasyon mevcuttur

   * @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebidir.
    bu sayede runner class'larımız cucumber ile çalışır.

   * @CucumberOptions notasyonu  ile istediğimiz özellikleri Runner Class'ına ekleyebiliriz
    Raporlama gibi extra option'larıda ileride ekleyeceğiz
    Ancak !
    Öncelikli görevi features dosyaları ile stepdefinitions'da bulunan java methodlarını
    ilişiklendirmektir.

   * tags : features clasoru içerisinde yazılan tag(lari) aratıp buldugu tüm feature veya
    senaryoları çalıştırır.


   * dryRun : iki değer alabilir
   * true: seçilirse , verilen tag ile işaretli olan Feature veya
    Scenario'daki eksik stepdefinitions'ları
    bulup ilgili method'ları olusturur.
    Hiçbir sekilde test'ımızı calıstırmaz eksik adım yoksa test PASSED olarak işaretler
    * false : seçilirse verilen tag ile işaretlenen Feature veya Scenario'ları calıstırır.
         dryRun : iki deger alabilir
        true : secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
                eksik stepdefinitions'lari bulup
                ilgili method'lari olusturur
                Hic bir sekilde testimizi calistirmaz
                eksik adim yoksa test passed olarak isaretler
        false : secilirse, verilen tag ile isaretlenen
                Feature veya Scenario'lari calistirir
    */


}
