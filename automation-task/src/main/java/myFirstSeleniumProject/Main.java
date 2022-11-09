package myFirstSeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pom.PracticeForm;

import java.io.File;
import java.time.Duration;


public class Main {

    public static void main(String[] args)  {
        File chromeDriver = new File("drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());

        WebDriver driver = new ChromeDriver();

        driver.get(PropertyReader.getProperty("demoqa.url.registration"));
        driver.manage().window().fullscreen();

        PracticeForm registration = new PracticeForm(driver);

        registration.enterFirstName("Jack");
        registration.enterLastName("Sparrow");
        registration.enterEmail("jacksparrow@gmail.com");
        registration.selectGender();
        registration.enterMobile("0726859745");
        registration.enterDateOfBirth();
        Select month = new Select(driver.findElement(By.xpath("//html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
        month.selectByVisibleText("May");

        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
        year.selectByVisibleText("1972");
        WebElement fullDate = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]"));
        fullDate.click();

        registration.enterSubject("Maths");
        registration.selectHobbies();
        registration.chooseFile("C:\\Users\\ro_apopa\\Documents\\File");
        registration.enterAddress("Java Street");

        registration.selectState();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4L));
        registration.insertState("Haryana");
        registration.selectCity();
        registration.inputCity("Panipat");
        registration.clickOnSubmit();
        registration.getSubmitMessage();

    }


}
