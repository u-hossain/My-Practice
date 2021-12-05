package command_providers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ElementActions {
    private static final Logger LOGGER = LogManager.getLogger(ElementActions.class);

    private By locator;
    private WebDriver driver;

    public ElementActions(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

    public WebElement getElement() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
    System.out.println("element exception for the locator" + locator + "and exception is " + e);
        }
        return element;
    }
}
