import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

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

        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")).sendKeys("test");


        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("u/General_Baby24");
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);


    }
}
