package config;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ConfigurationUITests {

    public static WebDriver driver()  {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @DataProvider(name="itemDetailsProvider")
    public Object[][] itemDetailsProvider() {
        return new Object[][] {
                {"kurtka", "300"}
        };
    }

}
