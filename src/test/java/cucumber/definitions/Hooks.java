package cucumber.definitions;

import cucumber.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup() {
    }

    @After
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failure_screenshot");
            scenario.log("olita de mar");
        }
    }

    @After
    public void shutDown() {
        DriverFactory.getDriver().quit();
    }
}
