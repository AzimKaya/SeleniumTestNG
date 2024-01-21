package tests.Alıstırmalar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationDeneme {
@Test
    public  void deneme(){

        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));


        //     3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        ReusableMethods.bekle(3);

        //4. Click 'Products' button
    AutomationPage automationPage=new AutomationPage();
        automationPage.ProductsClick.click();





    }


}
