import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Homework {

    public static WebDriver driver;

    @BeforeClass
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void WebDriverHelloWorldTest() throws InterruptedException {
        driver.get("http://automationpractice.com/");
        Thread.sleep(2000);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=search_query_top")));
        WebElement search = driver.findElement(By.cssSelector("#search_query_top"));
        search.sendKeys("Dress");
        WebElement button = driver.findElement(By.cssSelector("#searchbox > button"));
        button.click();
        Thread.sleep(1000);
        WebElement counter = driver.findElement(By.cssSelector("#center_column > h1 > span.heading-counter"));
        Assert.assertTrue(counter.getText().contains("7"));
        if(counter.getText().contains("7")){
            System.out.println("Equal to number of dress");
        }
        else{
            System.out.println("Not equal");
        }

        Thread.sleep(2000);

        List <WebElement> list = driver.findElements(By.xpath("//li[contains(@class,\"ajax_block_product\")]"));
        int number = 0;
        for (WebElement result : list) {
            number ++;
            WebElement element = result.findElement(By.xpath("//div/div[2]/h5/a"));
            Assert.assertTrue(element.getText().toLowerCase().contains("dress"));
            System.out.println("Drees " + number + " appeared");
            System.out.println(element.getText());



        }
//        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/table/tbody/tr[2]/td[2]/form/div[2]/button"));
//        searchButton.click();
//        Thread.sleep(1000);
//
//        WebElement advancedSearch = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/form/div[1]/span/span/button"));
//        advancedSearch.click();
//        Thread.sleep(1000);
//
//        WebElement englishLanguage = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/form/div[2]/div/label[2]/input"));
//        englishLanguage.click();
//        WebElement pastMonth = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/form/div[1]/div[2]/span/label[3]"));
//        pastMonth.click();
//        WebElement searchBut = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/form/div[3]/button"));
//        searchBut.click();
//        Thread.sleep(1000);
//
//        WebElement link = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div[1]/ul/li[1]/div/div[1]/a/h2/span"));
//        link.click();

    }
    @AfterClass
    public static void afterClass(){
        //driver.quit();
    }
}
