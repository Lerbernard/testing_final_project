import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class subreddit_page {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setUp() throws InterruptedException {
        driver.get("https://www.reddit.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //get the searchbar and enter keys
        WebElement searchbar = driver.findElement(By.xpath("//reddit-search-large"));
        searchbar.click();
        searchbar.sendKeys("r/SoftwareTesting");
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        action.moveToLocation(606,114).click().perform();   //clicking the subreddit page
    }
    @Test
    public void joinTheSubreddit() throws InterruptedException {
        //joining the subreddit
        Actions join = new Actions(driver);
        join.moveToLocation(1400,159).click().perform();
        Thread.sleep(2000);
    }
    @Test
    public void clickPosts() throws InterruptedException {
        Actions newPosts = new Actions(driver);
        newPosts.moveToLocation(390,358).click().perform();
    }


    @AfterTest
    public void tearDown2() throws InterruptedException {
        driver.quit();
    }
}
