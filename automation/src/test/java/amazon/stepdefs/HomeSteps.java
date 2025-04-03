package amazon.stepdefs;

import static amazon.stepdefs.Hooks.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import org.amazon.pageObject.BasePage;
import org.amazon.pageObject.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeSteps {

    HomePage homePage = new HomePage(driver);
    @Then("I should see user {string} displayed")
    public void IshouldSee(String userLabel){
      assertTrue(homePage.getUserTitle().contains(userLabel));
    }


  }
