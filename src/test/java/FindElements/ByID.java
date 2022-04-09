package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/ ");
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        WebElement searchNewButton = driver.findElement(By.id("search_room_submit"));
        WebElement enterYourEmailInput = driver.findElement(By.id("newsletter-input"));

        hotelLocationInput.sendKeys("Warsaw");
        enterYourEmailInput.sendKeys("test@test.com");

    }
}

