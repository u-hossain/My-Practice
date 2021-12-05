package mortgage_calculator_parameterized;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utillities.DateUtilis;

public class CalculateMorgageRateParameterized {
    WebDriver driver;
    Select select;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
    }

    private void enterData() {
        //Enter Home Value "300000"
        driver.findElement(By.id("homeval")).clear();
        driver.findElement(By.id("homeval")).sendKeys("300000");

        //Enter down payment "60000"
        driver.findElement(By.id("downpayment")).clear();
        driver.findElement(By.id("downpayment")).sendKeys("60000");

        //click on the radio Button $
        driver.findElement(By.name("param[downpayment_type]")).click();

        //Enter loan amount "240000"
        driver.findElement(By.id("loanamt")).clear();
        driver.findElement(By.id("loanamt")).sendKeys("240000");

        //Enter interest rate "3%"
        driver.findElement(By.id("intrstsrate")).clear();
        driver.findElement(By.id("intrstsrate")).sendKeys("3");

        //Enter loan years "30"
        driver.findElement(By.id("loanterm")).clear();
        driver.findElement(By.id("loanterm")).sendKeys("30");

        String date = DateUtilis.returnNextMonth();
        System.out.println();

        // Enter start month "Dec"
        select = new Select(driver.findElement(By.name("param[start_month]")));
        select.selectByVisibleText("Dec");

        // Enter the year "2021"
        driver.findElement(By.id("start_year")).clear();
        driver.findElement(By.id("start_year")).sendKeys("2021");

        // Enter Property Tax "5000"
        driver.findElement(By.id("pptytax")).clear();
        driver.findElement(By.id("pptytax")).sendKeys("5000");

        //Enter PMI "0.5"
        driver.findElement(By.id("pmi")).clear();
        driver.findElement(By.id("pmi")).sendKeys("0.5");

        //Enetr HOI "1000"
        driver.findElement(By.id("hoi")).clear();
        driver.findElement(By.id("hoi")).sendKeys("1000");

        //Enter monthly hoa "100"
        driver.findElement(By.id("hoa")).clear();
        driver.findElement(By.id("hoa")).sendKeys("100");

        // Select loan type "FHA"
        select = new Select(driver.findElement(By.name("param[milserve]")));
        select.selectByVisibleText("FHA");

        // Select "Buy" option
        select = new Select(driver.findElement(By.name("param[refiorbuy]")));
        select.selectByVisibleText("Buy");
    }

    @Test

    public void calculatMonthlyPayment() {
        enterData();

        // Click on the Calculate Button
        driver.findElement(By.name("cal")).click();


        String expectedTotalMonthlyPayment = "1,611.85";
        String formattedXpath = String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);

        boolean present = driver.findElement(By.xpath("//h3[text()='$1,611.85']")).isDisplayed();

        // validated that the total monthly payment is $1,611.85;
        Assert.assertTrue(present,"Total Monthly Payment is not presented");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
