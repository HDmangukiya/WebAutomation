package kiwisaver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
  public static final String WEBDRIVER_PATH = "src\\test\\resources\\chromedriver.exe";

  public static WebDriver createWebDriver() {
    System.setProperty("webdriver.chrome.driver", WEBDRIVER_PATH);
    String webdriver = System.getProperty("browser", "chrome");
    switch (webdriver) {
      case "firefox":
        return new FirefoxDriver();
      case "chrome":
        return new ChromeDriver();
      default:
        throw new RuntimeException("Unsupported webdriver: " + webdriver);
    }
  }
}
