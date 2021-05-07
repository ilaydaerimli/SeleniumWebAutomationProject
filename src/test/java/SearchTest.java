import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchTest extends BaseTest{

    public WebDriver driver;

    @Test
    public void TestSearch(){

        WebElement searchBox = driver.findElement(By.id("search_word"));
        searchBox.click();
        searchBox.sendKeys("bilgisayar");
        driver.findElement(By.className("header-search-find-link")).click();

    }

}
