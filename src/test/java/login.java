import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class login {



    @Test
    void login_site() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.reddit.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\'login-button\']")).click();
        WebElement username = driver.findElement(By.xpath("/html/body/shreddit-app/shreddit-overlay-display/span[4]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/shreddit-app/shreddit-overlay-display/span[5]/input"));


        username.sendKeys("General_Baby24");
        password.sendKeys("Testfinal24@");
        password.sendKeys(Keys.ENTER);


    }


}
