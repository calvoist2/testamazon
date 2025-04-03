package org.amazon.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver){
    super(driver);
    PageFactory.initElements(driver,this);
  }
  @FindBy(how = How.CLASS_NAME, using = "farmaciassimilaresmx-app-store-components-1-x-modal_wrapper_home_close")
  WebElement closeAlertButton;

  @FindBy(how = How.XPATH, using = "//input[@type='text' and contains(@id,'down')]")
  WebElement medicineInput;

  @FindBy(how = How.XPATH, using = "//span[contains(@class,'productBrand')]")
  List<WebElement> medicinesList;

  @FindBy(how = How.XPATH, using = "//p[text()='Ver en lista']")
  WebElement orderByListButton;
  public void closeAlert(){
      closeAlertButton.click();
  }

  public void fillEditText(String medicine){
    medicineInput.clear();
    medicineInput.sendKeys(medicine);
    medicineInput.sendKeys(Keys.ENTER);
  }

  public List<String> getMedicines(){
    waitForElement(orderByListButton);
    List<String> medicines = new ArrayList<>();
    for(WebElement medicine : medicinesList){
      medicines.add(medicine.getText());
    }
    return medicines;



  }


}
