import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class login {



    @Test
    void method1() throws InterruptedException {
        WebDriver driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.quit();
    }

    @Test
    void method2() throws InterruptedException {
        System.out.println("method 2");
    }
    @Test
    void method3() throws InterruptedException {
        System.out.println("method 3");
    }


}
