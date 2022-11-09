package cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    @FindBy(id = "username")
    private WebElement usernameTextBox;
    @FindBy(id = "password")
    private WebElement passwordTextBox;
    @FindBy(id = "register")
    private WebElement registerButton;
    @FindBy(id = "login")
    private WebElement loginButton;
    @FindBy(xpath= "//button[contains(@onclick, 'limited')]")
    private WebElement limitedVersionButton;
    @FindBy(xpath = "//div[@id=\"loginFailed\"]")
    private WebElement loginFailedMessage;
    @FindBy(xpath = "//*[. = 'Registration failed!']")
    private WebElement checkUserNameOrPasswordMessage;

    @FindBy(xpath ="//*[@id=\"signUpButton\"]")
    private WebElement signup;

    @FindBy(id ="logoutButton")
    private WebElement logOutButton;


    public RegistrationPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void enterUsername(String username) {
        usernameTextBox.clear();
        usernameTextBox.sendKeys(username);
    }

    public WebElement usernameChecker() {
        return usernameTextBox;

    }

    public void enterPassword(String password) {
        usernameTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void register() {
        registerButton.click();
    }

    public void login() {
        loginButton.click();
    }

    public void limitedVersionLoginButton() {
        limitedVersionButton.click();
    }

    public void registerButtonNotOnThePage() {
        registerButton.isDisplayed();
        registerButton.getText();
    }

    public String getloginFailedMessage() {
        return loginFailedMessage.getText();
    }



    public String getCheckUsernameOrPasswordMessage() {
        return checkUserNameOrPasswordMessage.getText();
    }

    public boolean failedMessageIsOnPage(){
        return checkUserNameOrPasswordMessage.isDisplayed();

    }
    public boolean signupIsPresent(){
        return signup.isDisplayed();
    }

    public void pressLogOutButton(){
        logOutButton.click();

    }
    public boolean registerButtonIsPresent(){
       return registerButton.isDisplayed();
    }

    public void clickOnSignUpButton(){
        signup.click();
    }




}
