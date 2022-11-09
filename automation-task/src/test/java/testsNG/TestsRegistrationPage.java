package testsNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import pom.RegistrationPage;

import java.time.Duration;

public class TestsRegistrationPage {
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
        login.enterEnvironmentName("qatraining ");
        login.enterLoginPassword("0Gx5");
        login.loginOnFirstPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        home = new HomePage(driver);
        wait = new WebDriverWait(driver,Duration.ofSeconds(5));


    }

    @Test
    public void registrationWithValidData() {
        registration.enterUsername("Cat7t"  + System.currentTimeMillis());
        registration.enterPassword("Kitten9" + System.currentTimeMillis());
        registration.register();

       wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("username")));

        Assert.assertEquals(home.logoutButtonMessage(),
                "Log out");
    }

    @DataProvider(name = "invalidUsernameValues")
    public Object[][] getInvalidUsername() {
        return new Object[][]{
                {"Ca7", "Kitten9?!"},
                {"cat7", "Kitten9?!"},
                {"CAT7", "Kitten9?!"},
                {"Catt", "Kitten9?!"},
                {"", "Kitten9?!"},
                {"Кот7", "Kitten9?!"}
        };
    }

    @Test(dataProvider = "invalidUsernameValues")

    public void registrationWithInvalidUsernameData(String userName, String password) {
        registration.enterUsername(userName + System.currentTimeMillis());
        registration.enterPassword(password + System.currentTimeMillis());
        registration.register();

       wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[. = 'Registration failed!']")));


//        Assert.assertEquals(registration.getCheckUsernameOrPasswordMessage(),"Login failed!" );
        Assert.assertTrue(registration.failedMessageIsOnPage());
    }

    @DataProvider(name = "invalidPasswordValues")
    public Object[][] getInvalidPassword() {
        return new Object[][]{
                {"Cat7!", "Kity9"},
                {"Cat7!", "kitty9"},
                {"Cat7!", "KITTY9"},
                {"Cat7!", "Kitten"},
                {"Cat7!", ""},
                {"Cat7!", "Котенок9"}
        };
    }

    @Test(dataProvider = "invalidPasswordValues")
    public void registrationWithInvalidPasswordData(String userName, String password) {
        registration.enterUsername(userName + System.currentTimeMillis());
        registration.enterPassword(password +System.currentTimeMillis());
        registration.register();



        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[. = 'Registration failed!']")));
        Assert.assertTrue(registration.failedMessageIsOnPage());

    }

    @Test
    public void registrationWithSameUsername(){
        registration.enterUsername("Cat7t");
        registration.enterPassword("Kitten9?");
        registration.register();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("registrationFailed")));

        Assert.assertTrue(registration.failedMessageIsOnPage());
    }

    @Test

    public void limitedVersionLinkIsPresent(){
        registration.limitedVersionLoginButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[@id=\"signUpButton\"]")));
        Assert.assertTrue(registration.signupIsPresent());

    }

}