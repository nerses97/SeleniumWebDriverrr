import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SearchFuncionalityTest {
    public static WebDriver driver;

    @BeforeClass
    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void WebDriverHelloWorldTest() throws InterruptedException {
        driver.get("https://auto.am/");
        driver.findElement(By.cssSelector("#select2-filter-make-container")).click();
        WebElement autoCompany = driver.findElement(By.xpath("//*[@id=\"select2-filter-make-results\"]"));
        List<WebElement> autoCompanyList = autoCompany.findElements(By.tagName("li"));
        selectDropDown(autoCompanyList, "Nissan");
        WebDriverWait waitForAutoCompany = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitForAutoCompany.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-v-model-container")));

        driver.findElement(By.cssSelector("#select2-v-model-container")).click();
        WebElement  autoModel = driver.findElement(By.cssSelector("#select2-v-model-results"));
        List<WebElement> autoModelList = autoModel.findElements(By.tagName("li"));
        selectDropDown(autoModelList, "350 Z");

        driver.findElement(By.xpath("//*/div[2]/div/div/div/div[3]/label[1]/span/span[1]/span/span[1]")).click();
        WebElement autoYearTo = driver.findElement(By.xpath("//*/span/span[2]/ul"));
        List<WebElement> autoYearListTo = autoYearTo.findElements(By.tagName("li"));
        selectDropDown(autoYearListTo,"2000");


        driver.findElement(By.xpath("//*/div[3]/label[2]/span/span[1]/span/span[1]")).click();
        WebElement autoYearFrom = driver.findElement(By.xpath("//*/span/span[2]/ul"));
        List<WebElement> autoYearFromList = autoYearFrom.findElements(By.tagName("li"));
        selectDropDown(autoYearFromList, "2020");


        driver.findElement(By.xpath("//*/div[2]/div/div/div/div[4]/label[1]/span/span[1]/span/span[1]")).click();
        WebElement autoPriceTo = driver.findElement(By.xpath("//*/span/span[2]/ul"));
        List<WebElement> autoPriceToList = autoPriceTo.findElements(By.tagName("li"));
        selectDropDown(autoPriceToList, "$3000");


        driver.findElement(By.xpath("//*/div[4]/label[2]/span/span[1]/span/span[1]")).click();
        WebElement autoPriceFrom = driver.findElement(By.xpath("//*/span[2]/ul"));
        List<WebElement> autoPriceFromList = autoPriceFrom.findElements(By.tagName("li"));
        selectDropDown(autoPriceFromList, "$27000");

        WebElement searchButton = driver.findElement(By.cssSelector("#search-btn"));
        searchButton.click();



    }
    public static void selectDropDown(List<WebElement> webElement, String value){
        for(WebElement option: webElement){
            if(option.getText().equals(value)){
                option.click();
                break;
            }
        }

    }
}
