package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
				 plugin = { "pretty","html:target/HTMLReports/cucumber-report.html",
						  "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
				 glue = "StepDefinitions", 
				 tags = "@KFZ-Versicherung-Test"
		)
public class TestRunner {

}
 