import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Locators {
    public static WebDriver driver;

    @BeforeClass
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void WebDriverHelloWorldTest() throws InterruptedException {
        driver.get("https://yandex.com/");
}
