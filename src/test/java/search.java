import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class search extends setup_login {
    public String url;


    @BeforeClass
    void  login() throws InterruptedException {
        login_site();

        url = driver.getCurrentUrl();
        Thread.sleep(3000);
    }

    @AfterClass
    void close_driver(){
        driver.quit();
    }

    @Test
    void seerch_page() throws InterruptedException {

        driver.get(url);
        Thread.sleep(3000);

        Actions search = new Actions(driver);
        search.moveToLocation(966, 31).click().build().perform();
        search.moveToLocation(966, 31).sendKeys("test").build().perform();
        Thread.sleep(3000);
        search.moveToLocation(966, 31).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        
        

    }
}
