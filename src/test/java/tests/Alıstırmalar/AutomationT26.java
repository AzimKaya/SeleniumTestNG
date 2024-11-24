package tests.Alıstırmalar;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationT26 {



    @Test
    public void automationT26(){

        //1. Launch browser.
        //2. Navigate to url. 'http://automationexercise.com'
        AutomationPage automationPage=new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        //3. Verify that home page is visible successfully
        String expectedUrl="http://automationexercise.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        //4. Scroll down page to bottom
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",automationPage.subscriptionText);

        // 5. Verify 'SUBSCRIPTION' is visible
        String expectedText="SUBSCRIPTION";
        String actualText=automationPage.subscriptionText.getText();
        ReusableMethods.bekle(3);
        //6. Scroll up page to top
        JavascriptExecutor javascriptExecutor1= (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",automationPage.signInLoginLinki);


        //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        ReusableMethods.bekle(3);
        String expectedEnginerrText="Full-Fledged practice website for Automation Engineers";
        String actualEnginerrText=automationPage.autoEnginerText.getText();
        System.out.println(automationPage.autoEnginerText.getText());
        ReusableMethods.bekle(3);
        Driver.closeDriver();




    }



}
