package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleTestPage {

  public   GoogleTestPage(){

      PageFactory.initElements(Driver.getDriver(),this);
  }




}
