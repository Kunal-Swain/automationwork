package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
"C:\\Users\\Signity\\eclipse-workspace\\Selenium_MrngBatch\\Cucumber_Framework\\FeatureFile" }, monochrome = true, tags = "@tag2", glue = "stepDefination", plugin = {"pretty", "html:test-output/cucumber/report2.html", "json:test-output/cucjson-reports/Cucumber.json" } )
public class Runner1 extends AbstractTestNGCucumberTests {
	//extendrcheck for scenario with simple changes
}
