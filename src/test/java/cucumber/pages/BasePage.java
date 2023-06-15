package cucumber.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashSet;
import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
    }

    public void waitForElementToBeVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementToBeVisible(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {

        }
    }
    public WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeSelected(WebElement element) {
        wait.until(ExpectedConditions.elementSelectionStateToBe(element, true));
    }

    public void waitForElementToBeRefreshed(WebElement element) {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
    }

    public void waitForElementToBeRefreshed(By by) {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(by)));
    }

    public void waitForElementToBeClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitForPresenceOfElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitForPresenceOfAllElements(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public boolean waitForTextToBePresentInElement(By by, String text) {
        try {
            if (wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text)))
                return true;
        } catch (TimeoutException e) {
            return false;
        }
        return false;
    }

    public boolean waitForTextToBeNonEmpty(final By by) {
        (new WebDriverWait(driver, Duration.ofSeconds(30))).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(by).getText().length() != 0;
            }
        });
        return false;
    }


    public void waitForInvisibilityOfElementByText(By by, String text) {
        wait.until(ExpectedConditions.invisibilityOfElementWithText(by, text));
    }

    public void waitForElementToBeInvisible(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void waitForElementToBeChecked(WebElement element) {
        wait.until(elementToBeChecked(element));
    }

    public byte[] takeScreenshot(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    private static ExpectedCondition<WebElement> elementToBeChecked(
            final WebElement element) {
        return new ExpectedCondition<WebElement>() {

            public ExpectedCondition<WebElement> visibilityOfElement =
                    ExpectedConditions.visibilityOf(element);

            @Override
            public WebElement apply(WebDriver driver) {
                WebElement element = visibilityOfElement.apply(driver);
                try {
                    if (element != null && element.getAttribute("checked").equals("true")) {
                        return element;
                    } else {
                        return null;
                    }
                } catch (StaleElementReferenceException e) {
                    return null;
                }
            }

            @Override
            public String toString() {
                return "element to be checked : " + element;
            }
        };
    }

    public static String generatePlate() {
        HashSet<String> generatedPlates = new HashSet<>();
        Random rand = new Random();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder plate = new StringBuilder();

        // Load the previously generated plates from the properties file
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("generated_plates.properties"));
            generatedPlates.addAll(props.stringPropertyNames());
        } catch (IOException e) {
            // If the file doesn't exist or can't be read, just ignore it
        }

        // Generate a unique plate that hasn't been generated before
        do {
            // Generate the first 4 random characters
            for (int i = 0; i < 4; i++) {
                int index = rand.nextInt(letters.length());
                plate.append(letters.charAt(index));
            }

            // Generate the next 2 random numbers
            int num1 = rand.nextInt(10);
            int num2 = rand.nextInt(10);

            // Combine the generated characters into the final plate
            plate.append(num1).append(num2);

        } while (generatedPlates.contains(plate.toString()));

        // Add the generated plate to the set of generated plates
        generatedPlates.add(plate.toString());

        // Store the generated plates in the properties file
        props.putAll(generatedPlates.stream().collect(Collectors.toMap(s -> s, s -> "")));
        try {
            props.store(new FileOutputStream("generated_plates.properties"), "Generated plates");
        } catch (IOException e) {
            // If the file can't be written, just ignore it
        }

        return plate.toString();
    }

}