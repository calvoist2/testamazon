package org.amazon.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver){
    super(driver);
    PageFactory.initElements(driver,this);
  }
  @FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
  WebElement userText;
  public String getUserTitle(){
    waitForElement(userText);
    return userText.getText();
  }
}
