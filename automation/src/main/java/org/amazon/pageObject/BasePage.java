package org.amazon.pageObject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  public WebDriver driver;
  public BasePage(WebDriver driver){
    this.driver = driver;
  }

  public void waitForElement(WebElement element){
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(d -> element.isDisplayed());
  }
}
