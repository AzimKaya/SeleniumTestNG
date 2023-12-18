package tests.day17testNgRaportsDataProvder;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_DataProviderKullanıimi extends TestBaseRapor {
    @DataProvider
    public static Object[][] aranacakUrunlerDataProvider() {
       String[][] aranacakUrunler={{"phone"},{"java"},{"dress"},{"nutella"},{"chair"},{"tea"}};

       return aranacakUrunler;
    }

    @Test
    public void cokluAramaTesti(){
 String[] aranacakUrunler={" phone", "java", "dress", "nutella", "chair", "tea"};
 String arananUrun;
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();

        int actualUrunSayisi;

        for (int i = 0; i <aranacakUrunler.length ; i++) {
            arananUrun=aranacakUrunler[i];


 //testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

// verilen urun listesindeki tum urunler icin arama yapip
// urun listesi : phone, java, dress, nutella, chair, tea
        testOtomasyonuPage.aramaKutusu.sendKeys(arananUrun + Keys.ENTER);


// her bir urun icin arama yapildiginda sonuc bulunabildigini test edin
actualUrunSayisi=testOtomasyonuPage.bulunanUrunElementleriList.size();
        Assert.assertTrue(actualUrunSayisi>0);
        }

    }
  @Test (dataProvider = "aranacakUrunlerDataProvider")
    public  void dataProviderCokluAramaTesti(String arananUrun){
extentTest=extentReports.createTest("Data providerTest","Belirlenen urun listesi icin arama yapilabilmeli");
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();

//testotomasyonu anasayfaya gidin
      Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
extentTest.info("testotomasyonu anasayfaya gider");

      // verilen urun listesindeki tum urunler icin arama yapip
// urun listesi : phone, java, dress, nutella, chair, tea
      testOtomasyonuPage.aramaKutusu.sendKeys(arananUrun +Keys.ENTER);

extentTest.info(" verilen urun listesindeki"+arananUrun+" tum urunler icin arama yapar");
      ReusableMethods.bekle(1);

      // her bir urun icin arama yapildiginda sonuc bulunabildigini test edin
     int actualUrunSayisi=testOtomasyonuPage.bulunanUrunElementleriList.size();
      Assert.assertTrue(actualUrunSayisi>0);
extentTest.info(arananUrun +"urun icin arama yapildiginda sonuc bulunabildigini test eder");







    }
}
