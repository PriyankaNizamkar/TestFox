import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class TestBase
{
    
    public static WebDriver setDriver() {
        System.setProperty("webdriver.chrome.driver","/Users/p0n013n/TestInterview/src/main/resources/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        return  driver;
    }

}
