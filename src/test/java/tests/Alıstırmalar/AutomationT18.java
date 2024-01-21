package tests.Alıstırmalar;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationT18 {

   @Test
   public  void test18() {



/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that categories are visible on left side bar
4. Click on 'Women' category
5. Click on any category link under 'Women' category, for example: Dress
6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
7. On left side bar, click on any sub-category link of 'Men' category
8. Verify that user is navigated to that category page
 */

      AutomationPage automationPage=new AutomationPage();
       //2. Navigate to url 'http://automationexercise.com'
       Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

       // 3. Verify that categories are visible on left side bar
       Assert.assertTrue(automationPage.categories.isDisplayed());

       JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
       javascriptExecutor.executeScript("arguments[0].scrollIntoView();",automationPage.WomencategoryClick);
       ReusableMethods.bekle(1);

       //4. Click on 'Women' category

       automationPage.WomencategoryClick.click();
       //5.Click on any category link under 'Women' category, for example: Dress

       automationPage.dressClick.click();
       //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
       Assert.assertTrue(automationPage.WomenDressProductsText.isDisplayed());
       //7. On left side bar, click on any sub-category link of 'Men' category
       automationPage.catagoryMen.click();
       automationPage.catagoryMenTsort.click();

       //8. Verify that user is navigated to that category page
       Assert.assertTrue(automationPage.MenProductsText.isDisplayed());






       Driver.closeDriver();
   }

    public  void test20(){





    }


@Test
    public void test21(){

ReusableMethods.automationexercise("azimkaya77@gmail.com","505790673");


    }










}
