package tests.Alıstırmalar;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationT21 {
@Test
    public void test21(){


/*


1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Click on 'View Product' button
6. Verify 'Write Your Review' is visible
7. Enter name, email and review
8. Click 'Submit' button
9. Verify success message 'Thank you for your review.'
 */


        //1. Launch browser

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        AutomationPage automationPage=new AutomationPage();

        //3. Click on 'Products' button
        automationPage.ProductsClick.click();

        //4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(automationPage.allProducts.isDisplayed());

        //5. Click on 'View Product' button
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",automationPage.viewProducWomentClick);
        ReusableMethods.bekle(1);
        automationPage.viewProducWomentClick.click();


        //6. Verify 'Write Your Review' is visible
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(automationPage.writeYourReviewText.isDisplayed(),"Verify 'Write Your Review' is not visible");

        //7. Enter name, email and review
        Faker faker=new Faker();
        automationPage.yourReviewNameBox.sendKeys(faker.name().name());
        automationPage.yourReviewİmailBox.sendKeys(faker.internet().emailAddress());
        automationPage.addReviewHereBox.sendKeys(faker.lorem().paragraph());

        //8. Click 'Submit' button
        automationPage.buttonReview.click();





    }


}
