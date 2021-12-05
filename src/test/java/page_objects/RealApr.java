package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class RealApr {
    private final By CalculatorTab = By.xpath("//label[text()='Calculator']");
    private final By HomePriceInputField = By.name("HomeValue");
    private final By DownPaymentInDollar = By.name("DownPaymentSel");
    private final By DownPaymentInputField = By.name("DownPayment");
    private final By InterestRateInputField = By.name("Interest");
    private final By CalculateRateButton = By.name("calcalute");
    private final By ActualAprRate = By.xpath("//*[@id='analysisDiv']/table/tbody/tr/td[1]/strong[text()='Actual APR:']/../../td[2]/strong");

    private static final Logger LOGGER = LogManager.getLogger(RealApr.class);

    public WebDriver driver;

    public RealApr(WebDriver driver) {
        this.driver = driver;
    }

}
