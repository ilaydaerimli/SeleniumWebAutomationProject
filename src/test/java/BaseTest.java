import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    LoginPage loginPage;


    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        System.out.println("Test initiated.");
        loginPage = new LoginPage(driver);
        System.out.println("Test initiated!");
    }

    @Test
    public void TestHomePage(){
        WebElement signbtn= driver.findElement(By.className("myBtn"));
        signbtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement mailbox= driver.findElement(By.id("email"));
        mailbox.click();
        mailbox.sendKeys("Your Email or Username");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Your Password");
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.id("loginButton")).click();
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test finished!");
    }
}
