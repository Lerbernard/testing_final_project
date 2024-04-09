import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login extends setup_login{
    @Test
    void  login_into_reddit() throws InterruptedException {
        login_site();
        driver.quit();
    }
}
