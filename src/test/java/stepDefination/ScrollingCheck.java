package stepDefination;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// console.log(window.scrollY); use this code in consol to scroll pixel detect

public class ScrollingCheck {
	WebDriver driver;
	String url = "https://www.globalsqa.com/samplepagetest/#google_vignette";
	Scenario scenario;
	// this.scenario = scenario;

	@Given("User Launch URL in")
	public void user_launch_url_in() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@When("Url loading successfully scroll to element")
	public void url_loading_successfully_scroll_to_element() throws Throwable {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"contact-form-comment-g2599-comment\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		// take ss
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// save screenshot to png file or any other format
		try {
			FileUtils.copyFile(screenshot, new File(
					"C:\\Users\\Signity\\eclipse-workspace\\Selenium_MrngBatch\\Cucumber_Framework\\Reports\\Screenhottest1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);

	}

	@Then("Scroll down by pixels")
	public void scroll_down_by_pixels() throws Throwable {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		takeScreenshots("i take screenshot here");
		Thread.sleep(3000);
		return;
	}

	@Then("Scroll up by pixels")
	public void scroll_up_by_pixels() throws Throwable {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(3000);
	}

	@Then("Scroll bottom of the page")
	public void scroll_bottom_of_the_page() throws Throwable {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
	}

	@Then("Scroll to top of the page")
	public void scroll_to_top_of_the_page() throws Throwable {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(3000);
	}

	@Then("Scroll to set for scroll position of the page")
	public void scroll_to_set_for_scroll_position_of_the_page() throws Throwable {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 600)");
		Thread.sleep(3000);
	}

	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	}

	private void takeScreenshots(String description) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        try {
        	scenario.attach(screenshot, "image/png", description);
        } catch(NullPointerException e) {
        	System.out.println("Detect why it is null");
        }
    }
}
