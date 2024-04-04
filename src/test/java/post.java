import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class post extends login{
    @BeforeTest
    void  login()
    {
        login_site();
    }

    @Test
    void test_1() throws InterruptedException {

    }

}

