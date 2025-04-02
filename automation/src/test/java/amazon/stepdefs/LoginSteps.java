package amazon.stepdefs;


import static amazon.stepdefs.Hooks.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.amazon.pageObject.LoginPage;

public class LoginSteps {
  public LoginPage loginPage = new LoginPage(driver);
  @Given("I type the user {string}")
  public void ITypeTheUser(String user){
    loginPage.typeLoginUser(user);
  }

  @And("I click the continue button")
  public void clickContinue(){
    loginPage.clickContinueButton();
  }

  @And("I click the sign in button")
  public void clickSignIn(){
    loginPage.clickSignInButton();
  }

  @And("I type the password {string}")
  public void ITypeThePassword(String password){
    loginPage.typeLoginPassword(password);
  }

}
