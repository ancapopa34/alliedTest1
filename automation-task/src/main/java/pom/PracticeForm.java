package pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeForm {

    private WebElement firstName;
    private WebElement lastName;
    private WebElement email;
    private WebElement gender;
    private WebElement mobile;
    private WebElement dateOfBirth;
    private WebElement subject;
    private WebElement uploadFile;
    private WebElement hobbies;
    private WebElement picture;
    private WebElement currentAddress;
    private WebElement state;
    private WebElement City;
    private WebElement submitButton;

    @FindBy(xpath = "//input[contains(@id,'firstName')] ")
    private WebElement getFirstName;

    @FindBy(xpath = "//input[contains(@id,'lastName')]")
    private WebElement getLastName;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")
    private WebElement getEmail;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    private WebElement getGender;

    @FindBy(xpath = "//div/input[contains(@placeholder,'Mobile Number')]")
    private WebElement getMobile;

    @FindBy(xpath = "//*[@id=\"dateOfBirthInput\"]")
    private WebElement getDateOfBirth;

    @FindBy(xpath = "//*[@id=\"subjectsInput\"]")
    private WebElement getSubject;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")
    private WebElement getHobbies;

    @FindBy(id = "uploadPicture")
    private WebElement getUploadFile;

    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    private WebElement getCurrentAddress;

    @FindBy(xpath = "//*[@id=\"stateCity-wrapper\"]/div[2]")
//    @FindBy(xpath ="//*[@id=\"stateCity-wrapper\"]/div/div[1]/div[1]")
    private WebElement getState;

    @FindBy(xpath = "//*[@id=\"react-select-3-input\"]")
    private WebElement getInputState;

    @FindBy(xpath = "//*[@id=\"stateCity-wrapper\"]/div[3]")
    private WebElement getCity;

    @FindBy(xpath = "//input[@id=\"react-select-4-input\"]")
    private WebElement getInputCity;

    @FindBy(id = "submit")
    private WebElement getSubmitButton;

    @FindBy (xpath = "//*[@id=\"example-modal-sizes-title-lg\"]")
    private WebElement getMessage;


    public PracticeForm(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    public void enterFirstName(String fName) {
        firstName.click();
        firstName.sendKeys(fName);
    }
    public void enterLastName(String lName) {
        lastName.click();
        lastName.sendKeys(lName);
    }
    public void enterEmail(String mail) {
        getEmail.click();
        getEmail.clear();
        getEmail.sendKeys(mail);
    }
    public void selectGender() {
        getGender.click();
    }

    public void enterMobile(String number) {
        getMobile.click();
        getMobile.sendKeys(number);
    }

    public void enterDateOfBirth() {
        getDateOfBirth.click();
        getDateOfBirth.clear();
    }

    public void enterSubject(String sub) {
        getSubject.click();
        getSubject.sendKeys(sub);
        getSubject.sendKeys(Keys.RETURN);
    }

    public void selectHobbies() {
        getHobbies.click();
    }

    public void chooseFile(String file) {
        getUploadFile.sendKeys(file);
    }

    public void enterAddress(String address) {
        currentAddress.click();
        currentAddress.sendKeys(address);
    }
    public void selectState() {
        getState.click();
    }
    public void insertState(String state1) {
        getInputState.clear();
        getInputState.sendKeys(state1);
        getInputState.sendKeys(Keys.RETURN);
    }
    public void selectCity() {
        getCity.click();
    }
    public void inputCity(String city1) {
        getInputCity.clear();
        getInputCity.sendKeys(city1);
        getInputCity.sendKeys(Keys.RETURN);
    }

    public void clickOnSubmit(){
        getSubmitButton.submit();
   }

   public void getSubmitMessage(){
        getMessage.isDisplayed();
   }
}
