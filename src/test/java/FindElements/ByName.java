package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/ ");
        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
        WebElement searchNewButton = driver.findElement(By.name("search_room_submit"));
        WebElement enterYourEmailInput = driver.findElement(By.name("email"));
        WebElement submitNewsletterButton = driver.findElement(By.name("submitNewsletter"));


        hotelLocationInput.sendKeys("Warsaw");
        enterYourEmailInput.sendKeys("test@test.com");

        searchNewButton.click();
        //searchNewButton.submit();

    }
}

