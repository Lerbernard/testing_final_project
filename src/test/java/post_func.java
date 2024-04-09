import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class post_func extends setup_login {

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


    @Test (priority = 1)
    void upvote_and_downVote() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/faceplate-tooltip/button")).click();
        driver.findElement(By.cssSelector("#user-drawer-content > ul:nth-child(1) > faceplate-tracker:nth-child(1) > li > a")).click();
        Thread.sleep(5000);

        Actions action = new Actions(driver);
        action.moveToLocation(1300, 300).click().build().perform();
        Thread.sleep(3000);

        Actions upvote = new Actions(driver);
        upvote.moveToLocation(742, 763).click().build().perform();
        Thread.sleep(1000);
        Actions upvote2 = new Actions(driver);
        upvote2.moveToLocation(742, 763).click().build().perform();

        Thread.sleep(2000);

        Actions down_vote = new Actions(driver);
        down_vote.moveToLocation(781, 763).click().build().perform();
        Thread.sleep(1000);
        Actions down_vote2 = new Actions(driver);
        down_vote2.moveToLocation(781, 763).click().build().perform();
    }
    @Test (priority = 2)
    void comment() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/faceplate-tooltip/button")).click();
        driver.findElement(By.cssSelector("#user-drawer-content > ul:nth-child(1) > faceplate-tracker:nth-child(1) > li > a")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("/html/body/shreddit-app/report-flow-provider/div/div[1]/div/main/div[2]/faceplate-tabgroup/a[2]")).click();

        Thread.sleep(1000);

        //Actions move = new Actions(driver);
        //move.moveToLocation(873, 241).click().build().perform();

        Actions action = new Actions(driver);
        action.moveToLocation(1300, 300).click().build().perform();

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/shreddit-async-loader[2]/comment-body-header/shreddit-async-loader/comment-composer-host/faceplate-tracker[1]/button")).click();
        driver.findElement(By.cssSelector("#main-content > shreddit-async-loader:nth-child(4) > comment-body-header > shreddit-async-loader > comment-composer-host > faceplate-form > shreddit-composer > div")).sendKeys("even more test comment test for test");
        driver.findElement(By.xpath("/html/body/shreddit-app/dsa-transparency-modal-provider/report-flow-provider/div/main/shreddit-async-loader[2]/comment-body-header/shreddit-async-loader/comment-composer-host/faceplate-form/shreddit-composer/button[2]")).click();


        Thread.sleep(1000);

        Actions menu = new Actions(driver);
        menu.moveToLocation(1000, 973).click().build().perform();

        Thread.sleep(1000);

        Actions delete = new Actions(driver);
        delete.moveToLocation(920, 1133).click().build().perform();

        Thread.sleep(1000);

        Actions delete_confirm = new Actions(driver);
        delete_confirm.moveToLocation(1329, 725).sendKeys(Keys.ENTER).build().perform();

    }

    @Test (priority = 3)
    void  navigate_picture() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/faceplate-tooltip/button")).click();
        driver.findElement(By.cssSelector("#user-drawer-content > ul:nth-child(1) > faceplate-tracker:nth-child(1) > li > a")).click();
        Thread.sleep(5000);

        Actions action = new Actions(driver);
        action.moveToLocation(1300, 300).click().build().perform();

        Thread.sleep(2000);

        Actions move_right = new Actions(driver);
        move_right.moveToLocation(1450, 449).click().build().perform();

        Thread.sleep(1000);

        Actions move_right2 = new Actions(driver);
        move_right2.moveToLocation(1450, 449).click().build().perform();

        Thread.sleep(1000);

        Actions move_left = new Actions(driver);
        move_left.moveToLocation(746, 453).click().build().perform();

        Thread.sleep(1000);

        Actions move_left2 = new Actions(driver);
        move_left2.moveToLocation(746, 453).click().build().perform();

    }

    @Test (priority = 4)
    void share_and_user_link_and_community() throws InterruptedException {

        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/faceplate-tooltip/button")).click();
        driver.findElement(By.cssSelector("#user-drawer-content > ul:nth-child(1) > faceplate-tracker:nth-child(1) > li > a")).click();
        Thread.sleep(5000);

        Actions action = new Actions(driver);
        action.moveToLocation(1300, 300).click().build().perform();

        Thread.sleep(2000);

        Actions share = new Actions(driver);
        share.moveToLocation(930, 764).click().build().perform();

        Thread.sleep(1000);

        Actions copy = new Actions(driver);
        copy.moveToLocation(930, 809).click().build().perform();

        Thread.sleep(1000);

        Actions community_link = new Actions(driver);
        community_link.moveToLocation(852, 99).click().build().perform();

        Thread.sleep(1000);

        Actions go_back = new Actions(driver);
        go_back.moveToLocation(1288, 319).click().build().perform();

        Thread.sleep(1000);

        Actions user_link = new Actions(driver);
        user_link.moveToLocation(851, 117).click().build().perform();


    }

    @Test (priority = 5)
    void other_functionality() throws InterruptedException {

        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/shreddit-app/reddit-header-large/reddit-header-action-items/header/nav/div[3]/div[2]/shreddit-async-loader/faceplate-dropdown-menu/faceplate-tooltip/button")).click();
        driver.findElement(By.cssSelector("#user-drawer-content > ul:nth-child(1) > faceplate-tracker:nth-child(1) > li > a")).click();
        Thread.sleep(5000);

        Actions action = new Actions(driver);
        action.moveToLocation(1300, 300).click().build().perform();

        Thread.sleep(2000);

        Actions menu = new Actions(driver);
        menu.moveToLocation(1465, 105).click().build().perform();

        Thread.sleep(1000);

        Actions save = new Actions(driver);
        save.moveToLocation(1343, 157).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();

        menu.moveToLocation(1465, 105).click().build().perform();
        save.moveToLocation(1343, 157).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();
        Actions hide = new Actions(driver);
        hide.moveToLocation(1400, 189).click().build().perform();

        Thread.sleep(1000);
        menu.moveToLocation(1465, 105).click().build().perform();
        hide.moveToLocation(1400, 101).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();
        Actions add_spoiler = new Actions(driver);
        add_spoiler.moveToLocation(1400, 275).click().build().perform();

        Thread.sleep(1000);
        menu.moveToLocation(1465, 105).click().build().perform();
        add_spoiler.moveToLocation(1400, 275).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();
        Actions nsfw_tag = new Actions(driver);
        nsfw_tag.moveToLocation(1400, 311).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();
        nsfw_tag.moveToLocation(1400, 311).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();
        Actions brand_affiliate = new Actions(driver);
        brand_affiliate.moveToLocation(1400, 353).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();
        brand_affiliate.moveToLocation(1400, 353).click().build().perform();

        Thread.sleep(1000);

        menu.moveToLocation(1465, 105).click().build().perform();
        Actions notification = new Actions(driver);
        notification.moveToLocation(1400, 388).click().build().perform();

        Thread.sleep(1000);
        menu.moveToLocation(1465, 105).click().build().perform();
        notification.moveToLocation(1400, 388).click().build().perform();




    }


}
