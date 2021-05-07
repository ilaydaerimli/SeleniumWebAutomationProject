import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void setUsernameOrEmail(){
        loginPage.setUsername("İlaydaerimli");
        Assertions.assertEquals("İlaydaerimli", loginPage.getUsername() , "Username or email is not correct!");
    }

    @Test
    public void setPassword(){
        loginPage.setPassword("cndckdnk2021");
        Assertions.assertEquals("cndckdnk2021", loginPage.getPassword(), "Password is not correct!");
    }
}
