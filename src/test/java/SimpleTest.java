import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SimpleTest {
    public static WebDriver driver;

    @BeforeClass
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void WebDriverHelloWorldTest() throws InterruptedException {
        driver.get("https://support.system76.com/");
        Thread.sleep(1000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement icon = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header[2]/nav/div[2]/a[2]"));
        icon.click();
        WebElement search =  driver.findElement(By.xpath("//*[@id=\"search-box\"]"));
        search.sendKeys("some text");
        Thread.sleep(1000);

//        WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/header/div/div/form/svg"));
//        searchIcon.click();
//        WebElement li = driver.findElement(By.xpath("//*[@id=\"search-results\"]/div"));
        WebElement firstLi = driver.findElement(By.xpath("//*[@id=\"search-results\"]/div/a[1]/div[1]"));
        firstLi.click();
    }
    @AfterClass
    public static void afterClass(){
        //driver.quit();
    }
}
