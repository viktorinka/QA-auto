package myTest;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import java.util.Date;
import java.util.logging.Level;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckConsole {

    @Test
    void CheckConsole(){
   open("https://affiliate.int.iqoption.com/");
        $(".css-o6tufk").click();
        $("[data-test-id=reg-email-field]").setValue("2082@mailinator.com");
        $("[data-test-id=reg-password-field]").setValue("Test1251");
        $("[data-test-id=reg-agreement-checkbox]").click();
        $(".css-j9sbed").click();

        ChromeOptions options = new ChromeOptions();

        LoggingPreferences logPrefs = new LoggingPreferences();
        //DesiredCapabilities capabilities = new DesiredCapabilities();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        options.setCapability("goog:loggingPrefs", logPrefs);

       // WebDriver driver = new ChromeDriver(options);
        LogEntries logEntries = WebDriverRunner.getWebDriver().manage().logs().get(LogType.BROWSER);
        System.out.println("Logs count " + logEntries.getAll().size());
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }



    };
}
