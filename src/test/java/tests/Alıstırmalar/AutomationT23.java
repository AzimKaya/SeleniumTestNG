package tests.Alıstırmalar;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

/*
 1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Signup / Login' button
5. Fill all details in Signup and create account
6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
7. Verify ' Logged in as username' at top
8. Add products to cart
9. Click 'Cart' button
10. Verify that cart page is displayed
11. Click Proceed To Checkout
12. Verify that the delivery address is same address filled at the time registration of account
13. Verify that the billing address is same address filled at the time registration of account
14. Click 'Delete Account' button
15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
   */


public class AutomationT23 {
    @Test
    public void AutomationT23(){

    //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

    //3. Verify that home page is visible successfully
    String expectedUrl="http://automationexercise.com";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    SoftAssert softAssert=new SoftAssert();

    // 4. Click 'Signup / Login' button
        AutomationPage automationPage=new AutomationPage();
        automationPage.signInLoginLinki.click();
        ReusableMethods.bekle(1);

    //5. Fill all details in Signup and create account
        automationPage.emailBox.sendKeys("azimkaya777@gmail.com");
        automationPage.passwordBox.sendKeys("5057906735");
        automationPage.loginLinki.click();

    //7. Verify ' Logged in as username' at top
        String expectedUsername="Logged in as username";
        String actualUserName=automationPage.loginAsUserName.getText();
        softAssert.assertEquals(actualUserName,expectedUsername,"Logged in as username is not visible");

    //8. Add products to cart
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",automationPage.urunResmi);
        ReusableMethods.bekle(1);
/*

    //9. Click 'Cart' button
        automationPage.addToCart.click();
        ReusableMethods.bekle(1);
        automationPage.continueLinki.click();



    //10. Verify that cart page is displayed
        //softAssert.assertTrue(automationPage.shoppingCart.isDisplayed()," cart page is not displayed");

    //11. Click Proceed To Checkout
        automationPage.proceedToCheckoutLinki.click();

    //12. Verify that the delivery address is same address filled at the time registration of account
        softAssert.assertTrue(automationPage.Yourdeliveryaddress.isDisplayed(),"delivery address is not same address");

    //13. Verify that the billing address is same address filled at the time registration of account
        softAssert.assertTrue(automationPage.Yourbillingaddress.isDisplayed(),"billing address is not same address ");

        //14. Click 'Delete Account' button
        //automationPage.deleteAccountLinki.click();


         */




Driver.quitDriver();


    }


}
