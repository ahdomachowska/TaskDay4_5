package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ByCssSelector {

    public static void main(String[] args) {

        String userEmail = "r123l@mail.com";

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();

        WebElement registerEmailInput = driver.findElement(By.id("email_create"));
        registerEmailInput.sendKeys(userEmail);
        driver.findElement(By.id("SubmitCreate")).click();

        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastNameInput.sendKeys("Doe");

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailInput.clear();
        emailInput.sendKeys(userEmail);

        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("qwerty12345");

        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();

        WebElement myAddressesElement = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(4) > a > span"));
        WebElement personalInformationElement = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(5) > a > span"));

    }
}

