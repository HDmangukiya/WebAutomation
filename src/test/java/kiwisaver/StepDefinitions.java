package kiwisaver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import kiwisaver.pages.HomePage;
import kiwisaver.pages.KiwiSaverCalculatorIFrame;
import kiwisaver.pages.KiwiSaverCalculatorPage;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {

	WebDriver driver = WebDriverFactory.createWebDriver();

	public StepDefinitions() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}


	@Given("I navigate to Westpac Home Page")
	public void i_navigate_to_westpac_home_page() {

		driver.get(HomePage.URL);

	}

	@Given("I select {string} from {string} main menu")
	public void i_select_from_main_menu(String menu_item, String menu) {
		if(menu.equals("KiwiSaver")) {
			Actions builder = new Actions(driver);
			WebElement we = driver.findElement(By.xpath(HomePage.kiwisaver_menu));
			builder.moveToElement(we).perform();


			if(menu_item.equals("KiwiSaver Calculators")) {
				driver.findElement(By.xpath(HomePage.kiwisaver_calculators_menu)).click();
			}

		}

	}
	@Then("the {string} page loads")
	public void the_page_loads(String page) {
		if(page.equals("KiwiSaver Calculators")){

			assertTrue("Fail to load page", driver.getCurrentUrl().equals(KiwiSaverCalculatorPage.URL));

		}

		if(page.equals("KiwiSaver Retirement Calculator")) {
			driver.switchTo().frame(KiwiSaverCalculatorPage.calculator_iframe);

		}

	}
	@Then("I click on {string}")
	public void i_click_on(String option) {
		if(option.equals("Click here to get started.")){ 
			driver.findElement(By.xpath("//a[text()='"+option+"']")).click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(KiwiSaverCalculatorPage.calculator_iframe));

		}

		if(option.equals("View your KiwiSaver retirement projections")) {
			driver.findElement(By.xpath("//span[text()='"+option+"']//parent::button")).click();
		}
	}
	@Then("I click on information icon besides {string} field")
	public void i_click_on_information_icon_besides_field(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath(KiwiSaverCalculatorIFrame.current_age_help_icon)))).sendKeys(Keys.ENTER);

	}

	@Then("a message: {string} is displayed below the {string} field")
	public void a_message_is_displayed_below_the_field(String msg, String field) {

		if(field.equals("Current age")) {
			WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.current_age_help));
			
			assertTrue(msg.toString().equals(we.getText().toString()));

		}
	}

	@After()
	public void closeBrowser() {

		driver.quit();
	}



}
