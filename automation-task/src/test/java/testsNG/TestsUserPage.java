package testsNG;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import pom.RegistrationPage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class TestsUserPage {

    private WebDriver driver;
    RegistrationPage registration;
    LoginPage login;
    HomePage home;
    WebDriverWait wait;


    @BeforeMethod
    public void OpenUrl() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cra.alliedtesting.md/");
        registration = new RegistrationPage(driver);
        login = new LoginPage(driver);
        login.enterEnvironmentName("qatraining");
        login.enterLoginPassword("0Gx5");
        login.loginOnFirstPage();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("username")));
        registration.enterUsername("Cat7t");
        registration.enterPassword("Kitten9");
        registration.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        home = new HomePage(driver);

    }

    @Test
    public void currencyValueDependingOnCurrencyNominal() {

        home.enterValueInCharCodesBox("HUF");
        home.clickOnCurrencyRateButton();
        home.getCurrencyRates();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                ((By.xpath("//*[@id=\"currenciesList\"]/div/button/strong[3]"))));

        Assert.assertTrue(home.currencyRatesAreDisplayed());
        assertThat(home.getCurrencyRates(), containsString(": 0.0474"));


        home.enterValueInCharCodesBox("MKD");
        home.clickOnCurrencyRateButton();
        home.getCurrencyRates();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                ((By.xpath("//*[@id=\"currenciesList\"]/div/button/strong[3]"))));


        Assert.assertTrue(home.currencyRatesAreDisplayed());
        assertThat(home.getCurrencyRates(), containsString(": 0.0474"));
    }


    @Test
    public void olderFromDateCurrencyRatesPanel() {
        home.insertDatePeriodFrom("1.07.1990");
        home.clickOnCurrencyRateButton();
//        wait.until(ExpectedConditions.visibilityOf(home.oldDateErrorIsPresentOnPageWB()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onGetCurrencyRatesFailAlert")));
        Assert.assertTrue(home.oldDateErrorIsPresentOnPage());
        Assert.assertEquals(home.getMessageText(),"400 Bad Request. Reason: '01.07.1990' date is too old" );
    }

    @Test
    public void olderToDateCurrencyRatesPanel() {
        home.insertDatePeriodFrom("20.10.2022");
        home.insertDatePeriodTo("1.07.1990");
        home.clickOnCurrencyRateButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onGetCurrencyRatesFailAlert")));

        Assert.assertEquals(home.getMessageText(),"400 Bad Request. Reason: '01.07.1990' date is too old" );
        Assert.assertTrue(home.oldDateErrorIsPresentOnPage());
    }

    @Test

    public void validFromDateCurrencyRatesPanel() {
        home.insertDatePeriodFrom("20.10.2022");
        home.clickOnCurrencyRateButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"currenciesList\"]")));
        Assert.assertTrue(home.currencyRatesFromValidDateIsDisplayed());
        System.out.println(home.currencyRatesFromValidDateText());

    }

    @Test
    public void defaultFromDateCurrencyRatesPanel() {
        home.insertDatePeriodTo("20.10.2021");
        home.clickOnCurrencyRateButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"currenciesList\"]")));
        System.out.println(home.getListOfElements());
        LocalDate date = LocalDate.parse("2021-10-20");
        LocalDate returnValue = date.minusDays(30);

        String date1 = returnValue.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Assert.assertTrue(home.getListOfElements().get(0).getText().contains(date1));
    }

    @Test
    public void greaterToDateCurrencyRatesPanel() {
        home.insertDatePeriodTo("20.10.2023");
        home.clickOnCurrencyRateButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onGetCurrencyRatesFailAlert")));
        Assert.assertTrue(home.oldDateErrorIsPresentOnPage());
        Assert.assertEquals(home.getMessageText(),"400 Bad Request. Reason: '20.10.2023'  future date is not valid" );
    }

    @Test
    public void defaultToDateCurrencyRatesPanel() {
        home.insertDatePeriodTo("01.08.2022");
        home.clickOnCurrencyRateButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"currenciesList\"]")));
        Assert.assertTrue(home.currencyRatesFromValidDateIsDisplayed());

        LocalDate localDate = LocalDate.parse(home.toDateFieldIsDisplayed(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Assert.assertEquals(LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")), localDate);
    }


    @Test

    public void DatePeriodCurrencyRatesPanel() {
        home.insertDatePeriodFrom("1.08.2022");
        home.insertDatePeriodTo("1.10.2022");
        home.clickOnCurrencyRateButton();
        home.insertDatePeriodFrom("1.07.2022");
        home.insertDatePeriodTo("1.09.2022");
        home.clickOnCurrencyRateButton();
        LocalDate dateOne = LocalDate.parse(home.firstDate(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate secondDate = LocalDate.parse(home.lastDate(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        Duration timeDifference = Duration.between(dateOne.atStartOfDay(), secondDate.atStartOfDay());
        Assert.assertTrue(timeDifference.toDays() < 60);
    }
    @Test
    public void emptyCharCodesCurrencyRatesPanel(){
        home.insertDatePeriodFrom("1.09.2022");
        home.insertDatePeriodTo("1.10.2022");
        home.clickOnCurrencyRateButton();
        Assert.assertTrue(home.currencyRatesAreDisplayed());
       Assert.assertTrue(home.getFirstElementFromList().contains("1.09.2022"));
       Assert.assertTrue(home.getLastElementFromList().contains("1.10.2022"));

    }
    @AfterMethod
     public void close(){
        driver.quit();
    }


}