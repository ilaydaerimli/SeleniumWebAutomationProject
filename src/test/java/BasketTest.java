import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BasketTest extends BaseTest {

    @Test
    public void testBasket(){
        driver.findElement(By.xpath(".//*[@class='pagination']/a[2]")).click();
        driver.findElement(By.xpath(".//*[@id='p-369374378']/div[1]/a[1]")).click();

        WebElement price= driver.findElement(By.xpath(".//*[@class='newPrice']/ins[1]"));
        String price_text= price.getText();

        WebElement quantityBox = driver.findElement(By.id("product-id"));
        quantityBox.click();
        quantityBox.clear();
        quantityBox.sendKeys("1");

        WebElement add_to_basket = driver.findElement(By.className("add-to-basket"));
        add_to_basket.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.className("header-cart-menu")).click();

        WebElement price_basket= driver.findElement(By.className("total-price"));
        String price_text2= price_basket.getText();

        if(price_text.compareTo(price_text2)>0){

            WebElement quantityBasket = driver.findElement(By.id("quantity_126686985817"));
            quantityBasket.click();
            quantityBasket.clear();
            quantityBasket.sendKeys("1");
            driver.findElement(By.className("spinnerUp")).click();
        }

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.className("sp-price-high-price")).click();
    }
}
