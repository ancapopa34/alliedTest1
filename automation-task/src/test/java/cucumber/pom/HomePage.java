package cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;
//    WebDriver driver;
//    @FindBy(id = "charCodesSearchParam")
//    private WebElement currencyRateCharCodesBox;
//
//    @FindBy(id="getCurrencyRatesButton")
//    private WebElement currencyRateButton;

    public HomePage(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    public String logoutButtonMessage() {
        return logoutButton.getText();
    }

//    public void enterValueInCharCodesBox(String value){
//        currencyRateCharCodesBox.click();
//        currencyRateCharCodesBox.sendKeys(value);
//    }
//
//    public void clickOnCurrencyRateButton(){
//        currencyRateButton.click();
//    }
//
//    public void getCurrencyRates(){
//        List<WebElement> currencyValues =  driver.findElements(By.id("currenciesList"));
//
//        System.out.println(currencyValues.size());
//
//
//    }

}





