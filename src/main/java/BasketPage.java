import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{

    private final By basket_button = By.id("header-cart-menu");


    public BasketPage(WebDriver driver) {

        super(driver);
    }
}
