import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class home_page extends setup_login{

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

    @Test(priority = 2)
    void test_sort() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToLocation(760, 77).click().build().perform();
        Thread.sleep(1000);

        Actions click = new Actions(driver);
        click.moveToLocation(760, 228).click().build().perform();
        Thread.sleep(1000);

        action.moveToLocation(760, 77).click().build().perform();
        click.moveToLocation(760, 269).click().build().perform();
        Thread.sleep(1000);

        action.moveToLocation(760, 77).click().build().perform();
        click.moveToLocation(760, 321).click().build().perform();
        Thread.sleep(1000);

        action.moveToLocation(760, 77).click().build().perform();
        click.moveToLocation(760, 367).click().build().perform();
        Thread.sleep(1000);


        action.moveToLocation(820, 82).click().build().perform();
        click.moveToLocation(822, 230).click().build().perform();
        Thread.sleep(1000);


        Thread.sleep(3000);



    }



    @Test(priority = 1)
    void click_sidebar() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.get(url);

        Actions action = new Actions(driver);
        action.moveToLocation(100, 135).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(100, 167).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(121, 315).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(111, 357).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(100, 462).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(100, 462).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(100, 462).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(109, 505).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(94, 542).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(100, 579).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(107, 616).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(100, 669).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(111, 723).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(110, 761).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(106, 809).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(113, 873).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(122, 911).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(125, 953).click().build().perform();
        Thread.sleep(1000);

        driver.get(url);
        Thread.sleep(1000);
        action.moveToLocation(1614, 187).click().build().perform();
        Thread.sleep(1000);


    }


}
