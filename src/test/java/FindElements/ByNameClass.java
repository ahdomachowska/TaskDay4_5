package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameClass {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver",
                    "src/main/resources/drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://hotel-testlab.coderslab.pl/en/");
            driver.findElement(By.className("user_login")).click();

            WebElement registerEmailInput = driver.findElement(By.id("email_create"));
            registerEmailInput.sendKeys("random123123email@mail.com");
            driver.findElement(By.id("SubmitCreate")).click();
    }
}
