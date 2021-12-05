package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Home {
    private final By HomeValueInputField = By.id("homeval");
    private final By DwonPaymentInField = By.id("downpayment");
    private final By SelectDownPaymentInDollar = By.id("param[downpayment_type]");
    private final By LoanAmountInputField = By.id("loanmat");
    private final By InterestRateInputField = By.id("interestrate");
    private final By LoanTermInputField = By.id("loanterm");
    private final By StartMonthDropDown = By.id("param[start_month]");
    private final By StartYearInputField = By.id("start_year");
    private final By PropertyTaxInputField = By.id("pptytax");
    private final By PmiInputField = By.id("pmi");
    private final By HoiInputField = By.id("hoi");
    private final By HoaInputField = By.id("hoa");
    private final By LoanTypeDropDown = By.id("param[milservel");
    private final By RefiorBuyDropDown = By.id("param[refiorbuy]");
    private final By CalculateButton = By.id("cal");

    private static final Logger LOGGER = LogManager.getLogger(Home.class);
    public WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

}

