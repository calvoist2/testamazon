package amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features"},
glue={"amazon.stepdefs"},
  plugin = {"pretty"},
  tags="@smoke"
)
public class TestRunner {
}
