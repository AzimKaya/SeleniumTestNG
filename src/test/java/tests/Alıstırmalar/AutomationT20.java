package tests.Alıstırmalar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationT20 {


@Test
    public void test20(){
        AutomationPage automationPage=new AutomationPage();

      /*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Enter product name in search input and click search button
6. Verify 'SEARCHED PRODUCTS' is visible
7. Verify all the products related to search are visible
8. Add those products to cart
9. Click 'Cart' button and verify that products are visible in cart
10. Click 'Signup / Login' button and submit login details
11. Again, go to Cart page
12. Verify that those products are visible in cart after login as well


       */


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        //3. Click on 'Products' button
        automationPage.ProductsClick.click();

        //4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(automationPage.allProducts.isDisplayed());

        //5. Enter product name in search input and click search button
        automationPage.searchproduct.sendKeys("DRESS");
        automationPage.submitsearchClick.click();

        //6. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(automationPage.searchedProducts.isDisplayed());

        //7. Verify all the products related to search are visible
        Assert.assertTrue(automationPage.searchedProducts.isDisplayed());

        //8. Add those products to cart
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",automationPage.addtocart1);
        ReusableMethods.bekle(1);

        automationPage.addtocart1.click();
        automationPage.continueShopping1.click();
         javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",automationPage.getViewCartClick);
         ReusableMethods.bekle(1);
        automationPage.getViewCartClick.click();

         //9. Click 'Cart' button and verify that products are visible in cart
        //Assert.assertTrue(automationPage.proceedToCheckout.isDisplayed());

        //10. Click 'Signup / Login' button and submit login details
         automationPage.signInLoginLinki20.click();

         automationPage.emailBox1.sendKeys("azimkaya777@gmail.com");
         automationPage.passwordBox1.sendKeys("5057906735");
         automationPage.loginLinkiClick1.click();

         //11. Again, go to Cart page
          Driver.getDriver().switchTo().newWindow(WindowType.WINDOW).get("https://automationexercise.com/view_cart");

         //12. Verify that those products are visible in cart after login as well
         Assert.assertTrue(automationPage.cartVerify.isEnabled());
















//Driver.closeDriver();


    }


}
