import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class search {

    @Test
     void setup(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.fgcu.edu/canvas/");
        String title  = driver.getTitle();
        System.out.println(title);

        String url_page = driver.getCurrentUrl();
        System.out.println(url_page);
        driver.quit();

    }
}
