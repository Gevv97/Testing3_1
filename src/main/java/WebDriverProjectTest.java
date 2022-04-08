import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class WebDriverProjectTest {
    public static WebDriver driver;

    @BeforeClass
    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver", "C://Users//user//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public static void navigation(){
        driver.get("https://news.am/eng/");

        var elem1 = driver.findElement(By.name("Search"));

        elem1.sendKeys("Nikol Pashinyan");
        elem1.click();


        var elem2 = driver.findElement(By.name("PM"));
        elem2.click();

    }
}
