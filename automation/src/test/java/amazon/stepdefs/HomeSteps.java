package amazon.stepdefs;

import static amazon.stepdefs.Hooks.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.amazon.pageObject.BasePage;
import org.amazon.pageObject.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeSteps {
    String medicine;
    HomePage homePage = new HomePage(driver);
    @Given("I close the alert")
    public void iCloseTheAlert(){
      homePage.closeAlert();
    }

    @When("I type the value {string}")
    public void iTypeTheValue(String medicine){
        this.medicine = medicine;
        homePage.fillEditText(medicine);
    }

    @Then("I should see related values")
    public void IShouldSeeRelatedValues(){
        List<String> medicines = homePage.getMedicines();
        for (String webMedicine: medicines){
            assertTrue(webMedicine.contains(this.medicine.toUpperCase()));
        }
    }





  }
