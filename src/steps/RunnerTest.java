package steps;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.epam.utilities.SingletonDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:./reports" ,
        "json:./reports/cucumber.json" ,
        "junit:./reports/cucumber.xml"},glue = "steps",features = "features", tags = "@EBayFeature")
public class RunnerTest {

	@BeforeClass
	public static void setUp() {
		SingletonDriver.getInstance().createDriver("FIREFOX");
	}
	
	@AfterClass
	public static void tearDown(){
		SingletonDriver.getDriver().close();
		SingletonDriver.getDriver().quit();
		
	}
}
