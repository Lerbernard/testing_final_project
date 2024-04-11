import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class user_page extends setup_login {
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
    void user_page_filetr() throws InterruptedException {

        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/faceplate-tooltip/button")).click();
        driver.findElement(By.cssSelector("#user-drawer-content > ul:nth-child(1) > faceplate-tracker:nth-child(1) > li > a")).click();
        Thread.sleep(3000);

        Actions click = new Actions(driver);
        click.moveToLocation(861,200).click().build().perform();
        Thread.sleep(1000);
        click.moveToLocation(974,195).click().build().perform();
        Thread.sleep(1000);
        click.moveToLocation(1043,195).click().build().perform();
        Thread.sleep(1000);
        click.moveToLocation(1130,194).click().build().perform();
        Thread.sleep(1000);
        click.moveToLocation(1214,193).click().build().perform();
        Thread.sleep(1000);
        click.moveToLocation(1316,191).click().build().perform();
        Thread.sleep(1000);

        driver.get("https://www.reddit.com/user/General_Baby24/");
        click.moveToLocation(1800,156).click().build().perform();
        Thread.sleep(1000);

        driver.get("https://www.reddit.com/user/General_Baby24/");
        click.moveToLocation(1773,475).click().build().perform();
        Thread.sleep(1000);

        driver.get("https://www.reddit.com/user/General_Baby24/");
        click.moveToLocation(1769,539).click().build().perform();
        Thread.sleep(1000);

        driver.get("https://www.reddit.com/user/General_Baby24/");
        click.moveToLocation(1772,600).click().build().perform();
        Thread.sleep(1000);

        driver.get("https://www.reddit.com/user/General_Baby24/");
        click.moveToLocation(1606,697).click().build().perform();
        Thread.sleep(1000);






    }

}
