package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://mystore-testlab.coderslab.pl/index.php");
        WebElement SingInButton = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        SingInButton.click();
        WebElement NoAccountButton =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        NoAccountButton.click();
        driver.navigate().back();
        driver.navigate().back();
        driver.quit();
    }
}

