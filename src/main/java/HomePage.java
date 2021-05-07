import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private final By login_button = By.id("myBtn");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
