package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
"C:\\Users\\Signity\\eclipse-workspace\\Selenium_MrngBatch\\Cucumber_Framework\\FeatureFile" }, monochrome = true, tags = "@tag3", glue = "stepDefination", plugin = {"pretty", "html:test-output/cucumber/scroll_report.html", "json:test-output/cucjson-reports/Cucumber.json" } )
public class Scrollcheck extends AbstractTestNGCucumberTests {
// "pretty", "html:target/cucumber-reports.html"
	//"pretty", "html:test-output/cucumber/scroll_report.html"
}
