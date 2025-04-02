package org.amazon.pageObject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
  public LoginPage(WebDriver webDriver){
    super(webDriver);
    PageFactory.initElements(webDriver,this);
  }


  @FindBy(how = How.ID, using ="ap_email")
  private WebElement emailText;

  @FindBy(how = How.ID, using ="continue")
  private WebElement continueButton;


  @FindBy(how = How.ID, using ="ap_password")
  private WebElement passwordText;

  @FindBy(how = How.ID, using = "signInSubmit")
  private WebElement signInButton;


  public void login( String password){







  }

  public void typeLoginUser(String username){
    emailText.sendKeys(username);
  }

  public void clickContinueButton(){
    continueButton.click();
  }
  public void typeLoginPassword(String password){
    waitForElement(passwordText);
    passwordText.sendKeys(password);
  }

  public void clickSignInButton(){
    signInButton.click();
  }



}
