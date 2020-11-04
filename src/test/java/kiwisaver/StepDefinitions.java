package kiwisaver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	
	WebDriver driver = WebDriverFactory.createWebDriver();

	
	@Given("I navigate to Westpac Home Page")
	public void i_navigate_to_westpac_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		driver.get("https://westpac.co.nz");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Given("I select {string} from {string} main menu")
	public void i_select_from_main_menu(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the {string} page loads")
	public void the_page_loads(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I click on {string}")
	public void i_click_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I click on information icon besides {string} field")
	public void i_click_on_information_icon_besides_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("a message: {string} is displayed below the {string} field")
	public void a_message_is_displayed_below_the_field(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@After()
	   public void closeBrowser() {
	       driver.quit();
	 }



}
