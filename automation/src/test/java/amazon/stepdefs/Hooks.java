package amazon.stepdefs;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Hooks {
  public static WebDriver driver;
  @Before
  public  static void setup(){

      String driverVersion;
      String appURL;
      try {
          Object o = new JSONParser().parse(new FileReader("capabilites.json"));
          JSONObject json = (JSONObject) o;
          driverVersion = (String)json.get("browser");
          appURL = (String) json.get("appURL");


      } catch (Exception e) {
          throw new RuntimeException(e);
      }

      switch (driverVersion){
          case "chrome":
              driver = new ChromeDriver();
              break;

          case "firefox":
              driver = new FirefoxDriver();
              break;
          case "edge":
              driver = new EdgeDriver();
              break;
          default:
              throw new RuntimeException("The option "+driverVersion+" was not found in the driver options");
      }

    driver.get(appURL);
    driver.manage().window().maximize();
  }

  @After
  public static void quit()
  {
    driver.quit();
  }
}
