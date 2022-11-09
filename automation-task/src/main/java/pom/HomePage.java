package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage {

    WebDriver driver;


    @FindBy(id = "logoutButton")
    private WebElement logoutButton;
    @FindBy(id = "charCodesSearchParam")
    private WebElement currencyRateCharCodesBox;

    @FindBy(id = "getCurrencyRatesButton")
    private WebElement currencyRateButton;

    @FindBy(xpath = "//*[@id=\"currenciesList\"]/div/button")
    private WebElement currencyRateValue;

    @FindBy(id = "fromDateSearchParam")
    private WebElement datePeriodFrom;

    @FindBy(id = "toDateSearchParam")
    private WebElement datePeriodTo;

    @FindBy(id = "onGetCurrencyRatesFailAlert")
    private WebElement badRequestErrorOnDate;

    @FindBy(xpath = "//*[@id=\"currenciesList\"]")
    private WebElement currencyRatesValidData;

    @FindBy(xpath = "//strong[text()=\"Value\"]//..")
    private List<WebElement> listOfElements;
    @FindBy(xpath = "//*[@id=\"currenciesList\"]/*")
    private List<WebElement> listFromEmptyChar;

    @FindBy(xpath = "//*[@id=\"currenciesList\"]")
    private List<WebElement> elementsFromGivenDate;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    public String logoutButtonMessage() {
        return logoutButton.getText();
    }
    public void enterValueInCharCodesBox(String value) {
        currencyRateCharCodesBox.clear();
        currencyRateCharCodesBox.sendKeys(value);
    }
    public void clickOnCurrencyRateButton() {

        currencyRateButton.click();
    }
    public String getCurrencyRates() {

        currencyRateValue.isDisplayed();
        return currencyRateValue.getText();
    }
    public boolean currencyRatesAreDisplayed() {
        return currencyRateValue.isDisplayed();
    }
    public void insertDatePeriodFrom(String fromDate) {
        datePeriodFrom.clear();
        datePeriodFrom.sendKeys(fromDate);
    }
    public void insertDatePeriodTo(String toDate) {
        datePeriodTo.clear();
        datePeriodTo.sendKeys(toDate);
    }
    public WebElement oldDateErrorIsPresentOnPageWB() {
//         badRequestErrorOnOlderDate.isDisplayed();
        return badRequestErrorOnDate;
    }
    public boolean oldDateErrorIsPresentOnPage() {
        return badRequestErrorOnDate.isDisplayed();
    }

    public boolean currencyRatesFromValidDateIsDisplayed() {
        return currencyRatesValidData.isDisplayed();
    }
    public String currencyRatesFromValidDateText() {
        return currencyRatesValidData.getText();
    }

    public List<WebElement> getListOfElements() {
        return listOfElements;
    }
    public String toDateFieldIsDisplayed() {
        return datePeriodTo.getText();
    }
    public String firstDate() {
        WebElement fDate = elementsFromGivenDate.get(0);
        return fDate.getText().substring(6, 16);
    }
    public String lastDate() {
        WebElement lDate = elementsFromGivenDate.get(elementsFromGivenDate.size() - 1);
        return lDate.getText().substring(6, 16);
    }

    public String getMessageText(){
       return badRequestErrorOnDate.getText();
    }

    public List<WebElement> getListFromEmptyChar(){
        return listFromEmptyChar;
    }

    public String getFirstElementFromList(){
         return listFromEmptyChar.get(0).getText().substring(6,16);
    }

    public String getLastElementFromList(){
        return  listFromEmptyChar.get(listFromEmptyChar.size()-1).getText().substring(6,16);

    }
}



