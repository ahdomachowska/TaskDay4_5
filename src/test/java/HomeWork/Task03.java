package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html ");
        WebElement FirstNameInput = driver.findElement(By.id("first-name"));
        FirstNameInput.sendKeys("Karol");
        WebElement LastNameInput = driver.findElement(By.id("last-name"));
        LastNameInput.sendKeys("Kowalski");
        WebElement genderRadiobutton = driver.findElement(By.name("gender"));
        genderRadiobutton.click();
        WebElement birthDateInput = driver.findElement(By.id("dob"));
        birthDateInput.sendKeys("05/22/2010");
        WebElement addressInput = driver.findElement(By.id("address"));
        addressInput.sendKeys("Prosta 51");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("karol.kowalski@mailinator.com");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Pass123");
        WebElement CompanyInput = driver.findElement(By.id("company"));
        CompanyInput.sendKeys("Coders Lab");
        WebElement CommentInput = driver.findElement(By.id("comment"));
        CommentInput.sendKeys("To jest mój pierwszy automat testowy");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        driver.quit();



    }
}