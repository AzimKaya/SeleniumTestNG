package tests.Alıstırmalar;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class zeroWebappsecurity_T1 extends TestBaseRapor {
    @Test
    public void zeroScreyTest(){

        extentTest=extentReports.createTest("ZeroScreyTesti","Kullanıcı belirlenen kelimeyi aratıp doğru arama yapıldıgini test eder.");
        ZeroPage zeroPage=new ZeroPage();
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        //2. Signin buttonuna tiklayin
        zeroPage.signInLinki.click();
        extentTest.info("Signin buttonuna tiklanamaı.");

        //3. Login alanina  “username” yazdirin
        zeroPage.usernameKutusu.sendKeys(ConfigReader.getProperty("toZerousernameText"));
        extentTest.info(" Login alanina  “username” yazdirilmadı");

        //4. Password alanina “password” yazdirin
        zeroPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toZeropasswordText"));
        extentTest.info(" Password alanina “password” yazdirilmadı");

        //5. Sign in buttonuna tiklayin
        zeroPage.signInButonu.click();
        extentTest.info("Sign in buttonuna tiklanmadi");

        //6. Back tusu ile sayfaya donun
        Driver.getDriver().navigate().back();
        extentTest.info("Back tusu ile sayfaya donunmedi");

         //7. Online Banking menusunden Pay Bills sayfasina gidin
         zeroPage.onlineBankingLinki.click();
         zeroPage.payBillsLinki.click();
         extentTest.info("Online Banking menusunden Pay Bills sayfasina gidilmedi");

         //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
         zeroPage.amountKutusu.sendKeys("200");
         extentTest.info("amount kismina yatirmak istediginiz herhangi bir miktari yazilmadı");

         //9. tarih kismina “2023-09-10” yazdirin
         zeroPage.tarihKutusu.sendKeys("2023-09-10");
         extentTest.info(" tarih kismina “2023-09-10” yazdirilmadi");

         //10. Pay buttonuna tiklayin
         zeroPage.payButonu.click();
         extentTest.info("Pay buttonuna tiklanmadi");

         //11. “The payment was successfully submitted.” mesajinin ciktigini test edin
         String expectedText="The payment was successfully submitted.";
         String actualText= zeroPage.paymentSuccessfullyText.getText();
         System.out.println(zeroPage.paymentSuccessfullyText.getText());

         SoftAssert softAssert=new SoftAssert();
         softAssert.assertEquals(actualText,expectedText,"The payment was successfully submitted cıkmadı.");
         extentTest.pass("The payment was successfully submitted.” mesajinin ciktigini test edilmedi");

         Driver.closeDriver();




    }
}
