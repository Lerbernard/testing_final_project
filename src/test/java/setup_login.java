import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class setup_login extends setup {

    void login_site() throws InterruptedException {
        driver.get("https://www.reddit.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\'login-button\']")).click();
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.xpath("/html/body/shreddit-app/shreddit-overlay-display/span[4]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/shreddit-app/shreddit-overlay-display/span[5]/input"));


        username.sendKeys("General_Baby24");
        password.sendKeys("Testfinal24@");

        password.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
}
