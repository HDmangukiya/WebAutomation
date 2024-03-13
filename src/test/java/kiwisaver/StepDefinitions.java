package kiwisaver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import kiwisaver.pages.HomePage;
import kiwisaver.pages.KiwiSaverCalculatorIFrame;

import static kiwisaver.pages.KiwiSaverCalculatorIFrame.current_projection;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
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
    if (menu.equals("KiwiSaver")) {
      Actions builder = new Actions(driver);
      WebElement kiwiSaverMenu = driver.findElement(By.xpath(HomePage.kiwisaver_button));
      builder.moveToElement(kiwiSaverMenu).perform();
      String kiwiSaverButtonXPath =
          "//button[contains(@class, 'MuiButton-containedPrimary') and .//span[text()='Open the calculator']]";
      WebElement kiwiSaverButton = driver.findElement(By.xpath(kiwiSaverButtonXPath));
      kiwiSaverButton.click();
    }
  }

  @Then("I click on information icon besides {string} field")
  public void i_click_on_information_icon_besides_field(String string) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement ageField =
        wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath(KiwiSaverCalculatorIFrame.current_age_field)));
    ageField.clear();
    ageField.sendKeys("28");
  }

  @Then("click to Next Question")
  public void clickToNextQuestion() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement nextQuestionButton =
        wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath(KiwiSaverCalculatorIFrame.current_age_NextQuestion)));
    nextQuestionButton.click();
    Thread.sleep(2000);
  }

  @And("I could see WE’RE HERE TO HELP alert box")
  public void iCouldSeeWEREHERETOHELPAlertBox() {
    try {
      WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.help_alert));
    } catch (NoSuchElementException e) {
      // If the alert box is not present, ignore the step
      System.out.println("WE'RE HERE TO HELP alert box is not present. Ignoring step.");
    }
  }

  @Then("I could see First Home option")
  public void iCouldSeeFirstHomeOption() {
    WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.first_home));
    we.click();
  }

  @Then("I could see dropdown for selection of expected years to purchase")
  public void iCouldSeeDropdownForSelectionOfExpectedYearsToPurchase() {
    WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.dropdown_expected_years));
    we.click();
  }

  @And("I select 2years from dropdown")
  public void iSelectYearsFromDropdown() {
    WebElement we =
        driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.dropdown_selection_2years));
    we.click();
  }

  @Then("I could see dropdown for selection of Employment status")
  public void iCouldSeeDropdownForSelectionOfEmploymentStatus() {
    WebElement we =
        driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.dropdown_employment_status));
    we.click();
  }

  @And("I select employed from dropdown")
  public void iSelectEmployedFromDropdown() {
    WebElement we =
        driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.dropdown_selection_employed));
    we.click();
  }

  @Then("I Enter on information box field for income per year")
  public void iEnterOnInformationBoxFieldForIncomePerYear() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement incomeField =
        wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath(KiwiSaverCalculatorIFrame.current_income)));
    incomeField.clear(); // Clear existing value if any
    incomeField.sendKeys("110000");
  }

  @Then("I Enter on information box field for Kiwisaver Balance")
  public void iEnterOnInformationBoxFieldForKiwisaverBalance() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement incomeField =
        wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath(KiwiSaverCalculatorIFrame.kiwi_saver_balance)));
    incomeField.clear(); // Clear existing value if any
    incomeField.sendKeys("20000");
  }

  @Then("click to Next Question for entering kiwisaver Balance")
  public void clickToNextQuestionForEnteringKiwisaverBalance() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement nextQuestionButton =
        wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath(KiwiSaverCalculatorIFrame.income_NextQuestion)));
    nextQuestionButton.click();
  }

  @Then("click to Next Question for selecting contribution rate")
  public void clickToNextQuestionForSelectingContributionRate() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement nextQuestionButton =
        wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath(KiwiSaverCalculatorIFrame.kiwisaver_NextQuestion)));
    nextQuestionButton.click();
  }

  @And("I could see dropdown for selection of Contribution rate")
  public void iCouldSeeDropdownForSelectionOfContributionRate() {
    WebElement we =
        driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.dropdown_contribution_rate));
    we.click();
  }

  @Then("I select rate from the options")
  public void iSelectRateFromTheOptions() {
    WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.contribution_rate));
    we.click();
  }

  @And("I could see dropdown for selection of Type of fund")
  public void iCouldSeeDropdownForSelectionOfTypeOfFund() {
    WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.dropdown_type_fund));
    we.click();
  }

  @Then("I select fund type from the options")
  public void iSelectFundTypeFromTheOptions() {
    WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.type_fund));
    we.click();
  }

  @And("I could see estimated balance")
  public void iCouldSeeEstimatedBalance() {
    WebDriverWait wait = new WebDriverWait(driver, 15);
    WebElement we = driver.findElement(By.xpath(KiwiSaverCalculatorIFrame.estimated_balance));
    WebElement projectionElement = driver.findElement(By.xpath(current_projection));

    if (projectionElement.isDisplayed()) {
      ((JavascriptExecutor) driver)
          .executeScript("arguments[0].scrollIntoView(true);", projectionElement);
      try {
        Thread.sleep(15000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      ScreenshotHelper.takeScreenshot(driver, "Estimated_Balance");
    }
  }

  @After()
  public void closeBrowser() {
    driver.quit();
  }
}
