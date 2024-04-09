import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class create_post extends setup_login {

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

        Actions action = new Actions(driver);
        action.moveByOffset(100, 100).click().build().perform();

        //save draft
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[2]/button")).click();
        Thread.sleep(5000);

        WebElement post = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button"));
        post.sendKeys(Keys.ENTER);
        Thread.sleep(5000);


    }

    @Test
    void create_a_post_with_image() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\'create-post\']/span")).click();

        // click image tab
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div/button[2]")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")).sendKeys("test");
        WebElement upload = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/input"));
        Thread.sleep(2000);


        Path path = Paths.get("test_image.png");
        String file_path = path.toAbsolutePath().toString();
        String file_path_2 = file_path.replace("test_image.png", "");
        String source = "src\\main\\resources\\test_image.png";
        Thread.sleep(2000);

        upload.sendKeys(file_path_2 + source);


        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("u/General_Baby24");
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement post = driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button"));
        post.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }

    @Test
    void create_a_post_with_link() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\'create-post\']/span")).click();

        // click image tab
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div/button[3]")).click();


        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/textarea")).sendKeys("https://www.fgcu.edu/canvas/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("u/General_Baby24");
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement post = driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/div[1]/button"));
        post.sendKeys(Keys.ENTER);
        Thread.sleep(5000);


    }

    @Test
    void create_a_post_with_poll() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\'create-post\']/span")).click();

        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("u/General_Baby24");
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div/button[4]")).click();
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.moveByOffset(100, 100).click().build().perform();

        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/textarea")).sendKeys("test");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[3]/div/div[1]/div/div/div")).sendKeys("test pole");
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div/input")).sendKeys("option 1");
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/input")).sendKeys("option 2");


        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[3]/div/input")).sendKeys("option 3");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#AppRouter-main-content > div > div > div._3ozFtOe6WpJEMUtxDOIvtU > div._31N0dvxfpsO6Ur5AKx4O5d > div._1OVBBWLtHoSPfGCRaPzpTf._3nSp9cdBpqL13CqjdMr2L_._2udhMC-jldHp_EpAuBeSR1.PaJBYLqPf_Gie2aZntVQ7._2OVNlZuUd8L9v0yVECZ2iA > div.HOFZo2X7Fr6JVBztpsByj > div._3w_665DK_NH7yIsRMuZkqB > div._1zq6UabIEJJ-z9grsiCJY7 > div:nth-child(2) > div._3GqK73QyFc10CoXE2bReko > div > div > div.vtFOVcu_sAJUlHd8Vxx_S > div:nth-child(1) > div:nth-child(3) > div > svg._1Fa4RPHlhrfUZuNaXK2-eP._2raOjruzA2S4cw-4wFtDJN")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'poll-creation-voting-length\']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/button[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\'poll-creation-voting-length\']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/button[2]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\'poll-creation-voting-length\']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/button[3]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\'poll-creation-voting-length\']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/button[4]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\'poll-creation-voting-length\']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/button[5]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\'poll-creation-voting-length\']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/button[6]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\'poll-creation-voting-length\']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/button[7]")).click();
        Thread.sleep(1000);

    }


    @Test
    void adding_tags() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        //click the create post button
        driver.findElement(By.xpath("//*[@id=\'create-post\']/span")).click();
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys("u/General_Baby24");
        driver.findElement(By.xpath("//*[@id='AppRouter-main-content']/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.moveByOffset(100, 100).click().build().perform();


        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div/button[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'AppRouter-main-content\']/div/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/div/button[2]/div")).click();
        Thread.sleep(1000);

    }
}