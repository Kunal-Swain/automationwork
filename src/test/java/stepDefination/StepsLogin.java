package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLogin {
	WebDriver driver;
	@Given("^User navigate Orange URL$")
	public void user_navigate_Orange_URL() throws Throwable {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://orangehrm.qedgetech.com/");
	   Thread.sleep(2000);
	}

	@When("^User logs in with username and with password$")
	public void user_logs_in_with_username_and_with_password() throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(2000);
	}

	@Then("^User Validates URL$")
	public void user_Validates_URL() throws Throwable {
		String exp = "dashboard";
	    String act = driver.getCurrentUrl();
	    if(act.contains(exp)) {
	    	System.out.println("Login Success");
	    }
	    else {
	    	System.out.println("Login Fails");
	    }
	    Thread.sleep(2000);
	}

	@Then("^User Close Application$")
	public void user_Close_Application() throws Throwable {
	    driver.quit();
	}
}
