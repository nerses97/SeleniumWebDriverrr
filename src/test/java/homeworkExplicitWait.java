import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class homeworkExplicitWait {

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
        Thread.sleep(1000);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement search = driver.findElement(By.xpath("//input[@id='text']"));
        search.sendKeys("Intel Core i9");
        //Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.cssSelector(" form > div.search2__button > button"));
        searchButton.click();
        //Thread.sleep(1000);

        WebElement advancedSearch = driver.findElement(By.cssSelector(" span > span > button"));
        advancedSearch.click();
//        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".advanced-search-loader_state_loaded > form")));

        WebElement englishLanguage = driver.findElement(By.cssSelector(".check-button_sideable_none.advanced-search__check-button.i-bem > input"));


        englishLanguage.click();
        WebElement pastMonth = driver.findElement(By.cssSelector(".radio-button__radio.radio-button__radio_side_right"));
        pastMonth.click();
        WebElement searchBut = driver.findElement(By.cssSelector(".advanced-search__clear > button"));
        searchBut.click();
        //Thread.sleep(1000);

        WebElement link = driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[1]/div/div[1]/a/h2/span"));
        link.click();

    }
    @AfterClass
    public static void afterClass(){
        //driver.quit();
    }
}

