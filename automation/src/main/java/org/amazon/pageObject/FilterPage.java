package org.amazon.pageObject;

import io.cucumber.java.sl.In;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class FilterPage extends BasePage{

    public FilterPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='min']")
    WebElement minimumPriceInput;

    @FindBy(how = How.XPATH, using = "//input[@name='max']")
    WebElement maximumPriceInput;

    @FindBy(how = How.XPATH, using = "//div[text()='Buscar']")
    WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'sellingPrice')]")
    List<WebElement> pricesList;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'loading')]")
    WebElement buyNowButton;





    public void filterByPrice(String minimumPrice, String maximumPrice){
        waitForElement(minimumPriceInput);
        minimumPriceInput.click();
        for(int i=0; i<6;i++){
            minimumPriceInput.sendKeys(Keys.BACK_SPACE);
        }
        minimumPriceInput.sendKeys(minimumPrice);
        maximumPriceInput.click();
        for(int i=0; i<6;i++){
            maximumPriceInput.sendKeys(Keys.BACK_SPACE);
        }
        maximumPriceInput.sendKeys(maximumPrice);
        searchButton.click();
        waitForURL(maximumPrice);
        waitForElementToBeClickable(buyNowButton);

    }

    public List<Integer> getPrices(){
        waitForElementToBeClickable(pricesList);
        List<Integer> prices = new ArrayList<>();
        for(WebElement price: pricesList){
            prices.add(Integer.parseInt(price.getText().replace("$","").replace(".00","").trim()));
        }
        return  prices;
    }





}
