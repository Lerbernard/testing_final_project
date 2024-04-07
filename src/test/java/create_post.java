import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class create_post extends setup_login {
    public String url;

    @BeforeClass
    void  login() throws InterruptedException {
        login_site();

        url = driver.getCurrentUrl();
        Thread.sleep(3000);
    }
    @AfterClass

    void close_driver(){
        //driver.quit();
    }

    @Test
    void create_a_post_with_text() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        //click the create post button
        driver.findElement(By.xpath("//*[@id=\'create-post\']/span")).click();


        // adding text to the text field
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")).sendKeys("testpost");
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div/div")).sendKeys("body");

        // selecting where to post it
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("u/General_Baby24");
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);

        // remember to add click the submit bottom

    }
    @Test
    void create_a_post_with_image() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\'create-post\']/span")).click();

        // click image tab
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div/button[2]")).click();

        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")).sendKeys("test");
        WebElement upload =  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/input"));

        Path path = Paths.get("test_image.png");
        String file_path = path.toAbsolutePath().toString();
        String file_path_2 = file_path.replace("test_image.png", "");
        String source = "src\\main\\resources\\test_image.png";



        upload.sendKeys(file_path_2 + source );



        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("u/General_Baby24");
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);


    }
}
