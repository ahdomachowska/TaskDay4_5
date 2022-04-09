package Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1 {

    private static WebElement search;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();

        WebElement registerEmailInput = driver.findElement(By.id("email_create"));
        registerEmailInput.sendKeys("randemail@mail.com");
        driver.findElement(By.id("SubmitCreate")).click();


        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        firstNameInput.sendKeys("John");

        if (firstNameInput.isDisplayed()) {
            firstNameInput.sendKeys("John");
        } else {
            throw new ElementNotInteractableException("firstNameInput");
        }

        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id='customer_lastname']"));
        lastNameInput.sendKeys("Goldberg");

        if (lastNameInput.isDisplayed()) {
            lastNameInput.sendKeys("Goldberg");
        } else {

            throw new ElementNotInteractableException("lastNameInput");
        }

        WebElement emailInput = driver.findElement(By.xpath("//*[@id='email']"));
        emailInput.clear();


        emailInput.sendKeys("hotel123@email.com");

        if (emailInput.isDisplayed()) {
            emailInput.sendKeys("hotel123@email.com");
        } else {

            throw new ElementNotInteractableException("emailInput");
        }

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='passwd']"));

        if (passwordInput.isDisplayed()) {
            passwordInput.sendKeys("Admin123!");
        } else {

            throw new ElementNotInteractableException("passwordInput");
        }

        WebElement submitAccountButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
        if (submitAccountButton.isDisplayed()) {
            submitAccountButton.click();
        } else {
            throw new ElementNotInteractableException("submitAccountButton");
        }

        // cssSelector
        WebElement myAddressesElement = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(4) > a > span"));
        WebElement myPersonalInformationElement = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(5) > a > span"));

        driver.quit();
    }
}

