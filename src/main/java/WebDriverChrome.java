import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {
    public static WebDriver driver;

    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver", "C://Users//user//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}