import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class create_post extends login{

    @BeforeTest
    void  login()
    {
        login_site();
    }
    @Test
    void create_a_post_with_text() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\'create-post\']/span")).click();



    }
}
