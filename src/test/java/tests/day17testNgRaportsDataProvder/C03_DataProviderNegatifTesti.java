package tests.day17testNgRaportsDataProvder;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderNegatifTesti {


    @AfterTest
    public void teardown(){

        Driver.closeDriver();
    }

    @DataProvider
    public static Object[][] kullaniciBilgileriDP() {

        String[][] kullaniciBilgileri ={{"kullanici1", "12345"},
                {"kullanici2", "23456"}, {"kullanici3", "34567"},
                {"kullanici4", "45678"}, {"kullanici5", "56789"}};

        return kullaniciBilgileri;
    }

    @Test(dataProvider = "KullanıcıBilgileriDp")
    public  void cokluNegatifLoginTesti(String username,String password){

// testotomasyonu anasayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

// account linkine tiklayin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();

// kullanici adi ve sifre olarak verilen listedeki
// tum degerler icin giris yapilamadigini test edin
        testOtomasyonuPage.emailKutusu.sendKeys(username);
        testOtomasyonuPage.passwordKutusu.sendKeys(password);
        testOtomasyonuPage.loginButonu.click();
        Assert.assertTrue(testOtomasyonuPage.emailKutusu.isDisplayed());

// kullanici1   12345
// kullanici2   23456
// kullanici3   34567
// kullanici4   45678
// kullanici5   56789





    }
}
