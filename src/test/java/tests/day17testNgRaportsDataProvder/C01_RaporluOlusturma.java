package tests.day17testNgRaportsDataProvder;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static org.testng.AssertJUnit.assertTrue;

public class C01_RaporluOlusturma extends TestBaseRapor {
@Test
    public void aramaTests(){

extentTest=extentReports.createTest("Aramatesti","Kullanıcı belirlenen kelimeyi aratıp doğru arama yapıldıgini test eder.");
// Testotomasyonu ana sayfaya gidin
    Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
extentTest.info("Kullanıcı estotomasyonu ana sayfaya gider");

//Belirlenen  arama kelimesi icin arama yapin
    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
    testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime")+ Keys.ENTER);
extentTest.info("Belirlenen  arama kelimesi icin arama yapar");

//Arama sonucunda urun bulunabildigini test edin
    int aramaSayisiAramaSonucSayisi=testOtomasyonuPage.bulunanUrunElementleriList.size();
    assertTrue(aramaSayisiAramaSonucSayisi>0);
extentTest.pass("Arama sonucunda urun bulunabildigini test eder");

// İlk urunu tiklayin
     testOtomasyonuPage.bulunanUrunElementleriList.get(0).click();
extentTest.info("İlk urunu tiklar");

//Acilan urun sayfasinda urun isminin
//Case sensitive olmadan phone icerdigini test edin
String actualUrunİsmiKucukHarf=testOtomasyonuPage.
                  urunSayfasindakiUrunIsimElementi.
                            getText().toLowerCase();
extentTest.info("Acilan urun sayfasinda urun isminin\ncase sensitive olmadan phone icerdigini test eder");
assertTrue(actualUrunİsmiKucukHarf.contains(ConfigReader.getProperty("toAranacakKelime")));

Driver.closeDriver();
extentTest.info("Sayfayi kapatir");

    }

}
