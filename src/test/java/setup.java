import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class setup
{
    public WebDriver driver;
    public setup()
    {
        driver = new ChromeDriver();
    }
    public WebDriver getdriver()
    {
        if (driver == null)
        {
            driver = new ChromeDriver();

            return driver;
        }
        else
        {
            return driver;
        }
    }
}