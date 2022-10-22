package runner;

import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

public class RunBase {
    static WebDriver driver;

    public enum Browser {CHROME, FIREFOX}

    public static WebDriver getDriver () {

        if (driver == null) {
            return getDriver(Browser.CHROME);
        } else {
            return driver;
        }
    }

    public static WebDriver getDriver (Browser browser) {

        if (driver != null) {
            driver.quit();
        }

        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Passe um Navegador Valido");
        }
        return driver;
    }
}
