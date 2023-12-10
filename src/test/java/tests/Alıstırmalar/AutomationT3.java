package tests.Alıstırmalar;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationT3 {
    // 1. Tarayıcıyı başlatın
//2. 'http://automationexercise.com' url'sine gidin
//3. Ana sayfanın başarıyla göründüğünü doğrulayın
//4. 'Kaydol / Giriş' düğmesine tıklayın
//5. 'Hesabınıza giriş yapın' mesajının görünür olduğunu doğrulayın
//6. Yanlış e-posta adresi ve şifre girin
//7. 'Giriş' düğmesine tıklayın
//8. 'E-posta adresiniz veya şifreniz yanlış!' hatasının göründüğünü doğrulayın

    //  7. Verify ' Logged in as username' at top
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'Login to your account' is visible
//6. Enter incorrect email address and password
//7. Click 'login' button
//8. Verify error 'Your email or password is incorrect!' is visible




//Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
@Test
public void test3(){


//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

//3. Verify that home page is visible successfully
String expectedUrl="http://automationexercise.com";
String actualUrl=Driver.getDriver().getCurrentUrl();
SoftAssert softAssert=new SoftAssert();
softAssert.assertEquals(actualUrl,expectedUrl,"home page is not visible");

// 4. Click 'Signup / Login' button
    AutomationPage automationPage=new AutomationPage();
    automationPage.signInLoginLinki.click();
    ReusableMethods.bekle(1);

//5. Verify 'Login to your account' is visible
    softAssert.assertTrue(automationPage.LogintoyouraccountText.isDisplayed(),"Login to your account,is not displayed ");

//6. Enter incorrect email address and password
    automationPage.emailBox.sendKeys("azimkaya77@gmail.com");
    automationPage.passwordBox.sendKeys("505790673");

//7. Click 'login' button
    automationPage.loginLinki.click();

//8. Verify error 'Your email or password is incorrect!' is visible
    softAssert.assertTrue(automationPage.YouremailorpasswordisincorrectText.isDisplayed(),"Your email or password is incorrect!,is not displayed ");


    }


}
