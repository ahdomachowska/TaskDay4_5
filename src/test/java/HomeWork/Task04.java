package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");
        WebElement SocialTitleArea = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input"));
        SocialTitleArea.click();
        WebElement FirstNameInput = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[2]/div[1]/input"));
        FirstNameInput.click();
        WebElement LastNameInput = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[3]/div[1]/input"));
        LastNameInput.click();
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[4]/div[1]/input"));
        emailInput.click();
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input"));
        passwordInput.click();
        WebElement showButton = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/span/button"));
        showButton.click();
        WebElement birthDate = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[6]/div[1]/input"));
        showButton.click();
        driver.quit();

    }
}
