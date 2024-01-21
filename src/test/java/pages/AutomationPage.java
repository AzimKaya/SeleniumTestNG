package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.prefs.BackingStoreException;

public class AutomationPage {

   public AutomationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signInLoginLinki;


    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginLinki;

    @FindBy(xpath = " //i[@class='fa fa-home']")
    public WebElement loginAsUserName;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    public WebElement urunResmi;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutLinki;

    @FindBy(xpath = "//*[text()='Your delivery address']")
    public WebElement Yourdeliveryaddress;

    @FindBy(xpath = "//*[text()='Your billing address']")
    public WebElement Yourbillingaddress;

    @FindBy(xpath = " //*[text()=' Delete Account']")
    public WebElement deleteAccountLinki;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement accountDeletedYazisi;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueLinki;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement  LogintoyouraccountText;

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement YouremailorpasswordisincorrectText;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement ContinueShopping;

    @FindBy(xpath = "//*[@class='searchform']")
   public WebElement subscriptionText;

    @FindBy(xpath = "//a[@id='scrollUp']")
    public WebElement arrowUpwart;// turuncu yukarı ok butonu

    @FindBy(xpath = "(//div[@class='item active'])[1]")
    public WebElement autoEnginerText;//Full-Fledged practice website for Automation Engineers text






//Test 18 Lokeytleri

 @FindBy(xpath = "//*[text()='Category']")
 public WebElement categories;

 @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
 public WebElement WomencategoryClick;

 @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]/a")
 public WebElement dressClick;

 @FindBy(xpath = "//h2[@class='title text-center']")
 public WebElement WomenDressProductsText;

 @FindBy(xpath = "(//span[@class='badge pull-right'])[2]")
 public WebElement catagoryMen;

 @FindBy(xpath = "//*[@id=\"Men\"]/div/ul/li[1]/a")
 public WebElement catagoryMenTsort;

 @FindBy(xpath = "//h2[@class='title text-center']")
 public WebElement MenProductsText;

//

 //Test20
@FindBy(xpath = "//i[@class='material-icons card_travel']")
 public WebElement  ProductsClick;

@FindBy(xpath = "//h2[@class='title text-center']")
 public WebElement  allProducts;

@FindBy(id = "search_product")
 public WebElement searchproduct;

@FindBy(id = "submit_search")
 public WebElement submitsearchClick;

@FindBy(xpath = "//h2[@class='title text-center']")
 public WebElement searchedProducts;

@FindBy(xpath ="(//a[@class='btn btn-default add-to-cart'])[1]")
 public WebElement addtocart1;

 @FindBy(xpath ="(//a[@class='btn btn-default add-to-cart'])[2]")
 public WebElement addtocart2;

 @FindBy(xpath = "//*[text()='Continue Shopping']")
 public WebElement continueShopping1;

@FindBy(xpath = "//*[text()='Proceed To Checkout']")
 public WebElement proceedToCheckout;


 @FindBy(xpath = "//*[text()=' Signup / Login']")
 public WebElement signInLoginLinki20;

 @FindBy(xpath = "//input[@data-qa='login-email']")
 public WebElement emailBox1;

 @FindBy(xpath = "//input[@type='password']")
 public WebElement passwordBox1;

 @FindBy(xpath = "//*[text()='Login']")
 public WebElement loginLinkiClick1;

 @FindBy(xpath = "//*[@class='active']")
 public  WebElement cartVerify;

 @FindBy(xpath = "//*[text()='View Cart']")
 public WebElement viewCart;


 @FindBy(xpath = "(//P[@class='text-center'])[2]")
 public WebElement getViewCartClick;









 //Test21
 @FindBy(xpath = "//h2[@class='title text-center']")
 public WebElement womenDressProductsText;

@FindBy(xpath =" (//a[@style='color: brown;'])[1]")
 public WebElement viewProducWomentClick;

@FindBy(xpath = "//*[text()='Write Your Review']")
public WebElement writeYourReviewText;

@FindBy(xpath = "//input[@type='text']")
 public WebElement yourReviewNameBox;

@FindBy(xpath = "//input[@type='email']")
 public WebElement yourReviewİmailBox;

@FindBy(xpath = "//textarea[@name='review']")
 public WebElement addReviewHereBox;

@FindBy(id = "button-review")
 public WebElement buttonReview;


}
