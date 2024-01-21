package utilities;

import org.testng.asserts.SoftAssert;
import pages.AutomationPage;

public class automationexerciseLogin {
    public  void automationexercise(String username,String password){
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
