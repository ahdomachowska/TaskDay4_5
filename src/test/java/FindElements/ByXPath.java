package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ByXPath {

//String userEmail = "random123123email@mail.com";


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();

        WebElement registerEmailInput = driver.findElement(By.id("email_create"));
        registerEmailInput.sendKeys("random123123email@mail.com");
        driver.findElement(By.id("SubmitCreate")).click();

        // wyszukanie first name
        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id='customer_lastname']"));
        lastNameInput.sendKeys("Goldberg");


        WebElement emailInput = driver.findElement(By.xpath("//*[@id='email']"));
        emailInput.clear();

        //emailInput.sendKeys(userEmail);

        emailInput.sendKeys("hotel123@email.com");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='passwd']"));
        passwordInput.sendKeys("Admin123!");

        driver.findElement(By.xpath("//*[@id='submitAccount']/span")).click();

    }
}
