package cucumber.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pom.HomePage;
import pom.LoginPage;
import pom.RegistrationPage;

import java.time.Duration;

public class stepDefinitionsForRegistrationPage {
    WebDriver driver;
    WebDriverWait wait;
    RegistrationPage registration;
    LoginPage login;
    HomePage home;
    String stringSameUser = "Cat7a" + System.currentTimeMillis();

    @Before()
    public void OpenUrl() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cra.alliedtesting.md/");
        registration = new RegistrationPage(driver);
        login = new LoginPage(driver);
        login.enterEnvironmentName("qatraining ");
        login.enterLoginPassword("0Gx5");
        login.loginOnFirstPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        home = new HomePage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("username")));
    }

    @Given("user enters valid data to username field")
    public void user_enters_valid_data_to_username_field() {
        registration.enterUsername("Cat7a" + System.currentTimeMillis());
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("username")));
    }

    @And("user enters  valid data to password field")
    public void users_enters_valid_data_to_password_field() {
        registration.enterPassword("Kitten9" + System.currentTimeMillis());
    }

    @When("user clicks on Register button")
    public void user_clicks_on_Register_button() {
        registration.register();
    }

    @Then("user verifies that the logout button is present on the page")
    public void user_verifies_that_the_logout_button_is_present_on_the_page() {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("logoutButton")));

        Assert.assertEquals(home.logoutButtonMessage(),
                "Log out");
    }
    @Given("^User enters invalid username ([^\"]*)$")
    public void users_enters_invalid_username(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("username")));
        registration.enterUsername(username);

    }
    @And("^User enters valid data for password ([^\"]*)$")
    public void User_enters_validP_data_for_password(String password) {
        registration.enterPassword(password);
    }

    @Then("User verifies that Registration failed message is displayed on page")
    public void user_verifies_that_registration_failed_message_is_displayed_on_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[. = 'Registration failed!']")));
        Assert.assertTrue(registration.failedMessageIsOnPage());
    }
    @And("^User inputs invalid data in the password box ([^\"]*)$")
    public void User_inputs_invalid_data_in_password_the_box(String password) {
        registration.enterPassword(password);
    }

    @Given("User clicks on limited version button")
    public void user_clicks_on_limited_version_button() {
        registration.limitedVersionLoginButton();
    }

    @And("User clicks on signup button")
    public void user_clicks_on_signup_button(){
        registration.clickOnSignUpButton();
    }

    @Then("User verifies that register button is present")
    public void user_verifies_that_signup_button_is_present() {
       wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("register")));
        Assert.assertTrue(registration.registerButtonIsPresent());
    }
    @Given("user enter an username")
    public void userEnterAnUsername() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("username")));
        registration.enterUsername(stringSameUser);
    }
    @And("user clicks on logout button")
    public void user_clicks_on_logout_button(){
        registration.pressLogOutButton();
    }
    @Then("user verifies that the register button is present")
    public void user_verifies_that_the_register_button_is_present(){
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("register")));
        Assert.assertTrue(registration.registerButtonIsPresent());
    }

        @After
        public void quit()
        {
            driver.quit();
            driver = null;
        }
    }




