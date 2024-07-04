package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//check git hub changes of the way
public class MultipleData {
	WebDriver driver;
	String url = "http://orangehrm.qedgetech.com/";
	@Given("User Launch URL in {string} #it can be use as parameter")
	public void user_launch_url_in_it_can_be_use_as_parameter(String brw) {
		if(brw.equalsIgnoreCase("chrome")) {
	    	System.out.println("Executing Chrome Browser");
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get(url);
	    }
		else if(brw.equalsIgnoreCase("firefox")) {
	    	System.out.println("Executing Firefox Browser");
	    	driver = new FirefoxDriver();
	    	driver.manage().window().maximize();
	    	driver.get(url);
	    }
	    else {
	    	System.out.println("Driver value not matching");
	    }
	}
	@When("User logs in with multiple data with username field {string}")
	public void user_logs_in_with_multiple_data_with_username_field(String username) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	}
	@When("User logs in with multiple data with password field {string}")
	public void user_logs_in_with_multiple_data_with_password_field(String password) {
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}
	@When("User clcik on login button")
	public void user_clcik_on_login_button() {
		driver.findElement(By.name("Submit")).click();
	}
	@Then("User validate URL")
	public void user_validate_url() {
		String exp = "dashboard";
	    String act = driver.getCurrentUrl();
	    if(act.contains(exp)) {
	    	System.out.println("Login Success");
	    }
	    else {
	    	System.out.println("Login Fails");
	    }
	}
	@Then("User close browser")
	public void user_close_browser() {
		driver.quit();
	}
	
}