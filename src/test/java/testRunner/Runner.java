package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"D:\\Automation\\Projects\\Selenium_MrngBatch\\Cucumber_Framework\\FeatureFile" }, monochrome = true, glue = "stepDefination", plugin = {
				"pretty", "html:test-output/cucumber/report.html", "json:test-output/cucjson-reports/Cucumber.json" })
public class Runner extends AbstractTestNGCucumberTests {

}//git push comit check
