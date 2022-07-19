package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constrants.locators.TestAutomationPractice.*;


public class TestAutomationPracticeSearchPage {

    private WebDriver driver;

    private By searchfield = By.id(searchField);
    private By button = By.name(searchButton);
    public TestAutomationPracticeSearchPage(WebDriver driver){
        this.driver = driver;
    }


    public void fillSearchField(String keyword){driver.findElement(searchfield).sendKeys(keyword);}
    public void clickSearchbutton(){driver.findElement(button).click();}




    public void findAllPrices(WebElement element){
        List<WebElement> findAllPricesList = element.findElements(By.xpath(productPrice));
    }




}
