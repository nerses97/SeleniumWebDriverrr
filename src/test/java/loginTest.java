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

public class loginTest {
    public static WebDriver driver;

    @BeforeClass
    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }




    @Test
    public void validTestCase() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement button = driver.findElement(By.cssSelector(".radius"));
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")));
        WebElement message = driver.findElement(By.cssSelector("#flash"));
        Assert.assertTrue(message.getText().contains("You logged into a secure area!"));
        System.out.println(message.getText());




    }
    @Test
    public void negativeTestCase1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement button = driver.findElement(By.cssSelector(".radius"));
        username.sendKeys("tomsmith");
        password.sendKeys("incorrectpassword");
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")));
        WebElement message = driver.findElement(By.cssSelector("#flash"));
        Assert.assertTrue(message.getText().contains("Your username is invalid!"));
        System.out.println(message.getText());

    }
    @Test
    public void negativeTestCase2() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement button = driver.findElement(By.cssSelector(".radius"));
        username.sendKeys("incorrectLogin");
        password.sendKeys("SuperSecretPassword!");
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")));
        WebElement message = driver.findElement(By.cssSelector("#flash"));
        Assert.assertTrue(message.getText().contains("Your username is invalid!"));
        System.out.println(message.getText());

    }
    @Test
    public void negativeTestCase3() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement button = driver.findElement(By.cssSelector(".radius"));
        //username.sendKeys("incorrectLogin");
        //password.sendKeys("SuperSecretPassword!");
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")));
        WebElement message = driver.findElement(By.cssSelector("#flash"));
        Assert.assertTrue(message.getText().contains("Your username is invalid!"));
        System.out.println(message.getText());

    }
    @Test
    public void negativeTestCase4() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement button = driver.findElement(By.cssSelector(".radius"));
        username.sendKeys("incorrectLogin");
        //password.sendKeys("SuperSecretPassword!");
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")));
        WebElement message = driver.findElement(By.cssSelector("#flash"));
        Assert.assertTrue(message.getText().contains("Your username is invalid!"));
        System.out.println(message.getText());

    }
    @Test
    public void negativeTestCase5() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement button = driver.findElement(By.cssSelector(".radius"));

        //username.sendKeys("incorrectLogin");
        password.sendKeys("SuperSecretPassword!");
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")));
        WebElement message = driver.findElement(By.cssSelector("#flash"));
        Assert.assertTrue(message.getText().contains("Your username is invalid!"));
        System.out.println(message.getText());

    }
}

