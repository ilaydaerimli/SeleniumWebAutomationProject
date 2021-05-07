import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private final By username = By.id("L-userNameField");
    private final By password = By.id("L-BasicPasswordField");


    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void setUsername(String usernameText){
        WebElement usernameInput = driver.findElement(username);
        usernameInput.click();
        usernameInput.sendKeys(usernameText);
    }

    public void setPassword(String passwordText){
        WebElement passwordInput = driver.findElement(password);
        passwordInput.click();
        passwordInput.sendKeys(passwordText);
    }

    public String getUsername(){
        WebElement usernameInput = driver.findElement(username);
        return usernameInput.getAttribute("value");
    }

    public String getPassword(){
        WebElement passwordInput = driver.findElement(password);
        return passwordInput.getAttribute("value");
    }

}
