import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login extends setup_login{
    @BeforeSuite
    void  login_into_reddit() throws InterruptedException {
        login_site();

        url = driver.getCurrentUrl();
        Thread.sleep(3000);
    }
    @AfterSuite
    void  close() throws InterruptedException {
        driver.quit();
    }
}
