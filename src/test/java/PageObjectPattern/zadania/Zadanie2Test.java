package PageObjectPattern.zadania;

import PageObjectPattern.zadania.hotelPage.AuthenticationPage;
import PageObjectPattern.zadania.hotelPage.RoomBookingPage;
import PageObjectPattern.zadania.hotelPage.SearchBar;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Zadanie2Test {

    private WebDriver driver;

    @Test
    public void registerTest() {
        //driver = Utils.createChromeDriver();
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // sign in powinno tez byc w page object patter
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.logIn("alfonskawka1@mail.com", "qwerty1234");


        WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a"));
        homeButton.click();

        SearchBar searchBar = new SearchBar(driver);
        searchBar.searchForHotel("The Hotel Prime", "14-04-2022", "25-04-2022");


        RoomBookingPage roomBookingPage = new RoomBookingPage(driver);
        roomBookingPage.bookRoom("3", "Executive Rooms");

    }
}