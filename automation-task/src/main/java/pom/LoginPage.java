package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//div[@class='form-group']/input[@id='environmentname']")
    private WebElement environmentName;
    @FindBy(id ="environmentpassword")
    private WebElement loginPassword;
    @FindBy(id ="envlogin")
    private WebElement firstLoginButton;

//    @FindBy(id ="environmentname")

//    @FindBy(xpath = "//input[@id='environmentname']")
//
//    private WebElement getEnvironmentName;
//
//
//     private WebElement getLoginPassword;
//
//
//    private WebElement getFirstLoginButton;

    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void enterEnvironmentName(String environmentN){
        environmentName.clear();
        environmentName.sendKeys(environmentN);
    }

    public void enterLoginPassword( String logPassword){
        loginPassword.clear();
        loginPassword.sendKeys(logPassword);
    }

    public void loginOnFirstPage(){
        firstLoginButton.click();
    }



}
