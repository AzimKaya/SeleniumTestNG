package tests.Alıstırmalar;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestOtomasyonu_T1 {
    @Test
    public void t1(){
        //1-Testotomasyonu.com anasayfasina gidelim
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        //2- Arama kutusunu locate edip, “phone” ile arama yapalim
        testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        //3- Bulunan sonuc sayisini yazdiralim
        System.out.println(testOtomasyonuPage.sonucYaziElementi.getText());

        //4- Ilk urunu tiklayalim
        testOtomasyonuPage.firstPhone.click();

        //6- Urunun stokta var oldugunu test edin
        String expectedStockText="Availibility: In Stock";
        String actualStokText=testOtomasyonuPage.firstPhoneStockİn.getText();
        System.out.println(testOtomasyonuPage.firstPhoneStockİn.getText());

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualStokText,expectedStockText,"Urunun stokta yok");

        Driver.closeDriver();






    }
}
