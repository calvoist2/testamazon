package org.amazon.pageObject;

import java.time.Duration;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  public WebDriver driver;
  public BasePage(WebDriver driver){
    this.driver = driver;
  }

  public void waitForElement(WebElement element){
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOf(element));
  }
  public void waitForElementToBeClickable(WebElement element){
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.invisibilityOf(element));
  }

  public void waitForURL(String max){
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.urlContains("20"+max));
  }

  public void waitForElementToBeClickable(List<WebElement> elements){
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfAllElements(elements));
  }




}
