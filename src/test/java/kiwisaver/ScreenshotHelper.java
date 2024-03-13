package kiwisaver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHelper {

  public static void takeScreenshot(WebDriver driver, String fileName) {
    // Convert WebDriver object to TakesScreenshot
    TakesScreenshot screenshot = (TakesScreenshot) driver;

    // Capture the screenshot as File
    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

    // Define the directory to save the screenshot
    String directory = "screenshots/";

    // Create the directory if it doesn't exist
    Path path = Paths.get(directory);
    if (!Files.exists(path)) {
      try {
        Files.createDirectories(path);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    // Generate the timestamp for the screenshot
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
    String timestamp = now.format(formatter);

    // Construct the file path
    String filePath = directory + fileName + "_" + timestamp + ".png";

    // Save the screenshot to the specified file path
    try {
      Files.copy(sourceFile.toPath(), Paths.get(filePath));
      System.out.println("Screenshot saved: " + filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
