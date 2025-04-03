package amazon.stepdefs;

import io.cucumber.java.en.When;
import org.amazon.pageObject.FilterPage;

import java.util.List;

import static amazon.stepdefs.Hooks.driver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterSteps {
    FilterPage filterPage = new FilterPage(driver);

    @When("I fill the min value with {int} and the max value with {int}")
    public void iFillTheMinValueWithMinAndTheMaxValueWithMax(int min, int max) {
        filterPage.filterByPrice(String.valueOf(min), String.valueOf(max));
    }

    @When("I should see values inside the range of {int} and {int}")
    public void iSeeValuesInsideTheRange(int min, int max){
        List<Integer> prices = filterPage.getPrices();
        for(Integer price: prices){
            assertTrue(price>=min,"Price is less than minimum "+price+" "+min);
            assertTrue(price<=max,"Price is more than maximum "+price+" "+max);
        }
    }


}
