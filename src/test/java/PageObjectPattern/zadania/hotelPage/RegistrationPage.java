package PageObjectPattern.zadania.hotelPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    private WebDriver driver;

    @FindBy(id = "customer_firstname")
    private WebElement FirstNameInput;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;

    @FindBy(id = "passwd")
    private WebElement passwdInput;

    @FindBy(id = "submitAccount")
    private WebElement submitButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void registerUser(String firstName, String lastName, String password) {
        FirstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        passwdInput.sendKeys(password);
        submitButton.click();

    }

}

