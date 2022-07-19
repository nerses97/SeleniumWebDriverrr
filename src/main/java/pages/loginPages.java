package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constrants.locators.loginPage.*;

public class loginPages {

    private WebDriver driver;
    private By usernameField = By.cssSelector(Username);
    private By passwordField = By.cssSelector(Password);
    private By loginButton = By.cssSelector(Button);

    public loginPages(WebDriver driver){
        this.driver = driver;
    }
    public void navigateToUrl(String url){
        driver.get(url);
    }
    public void fillUsername(String keyword){
        driver.findElement(usernameField).sendKeys(keyword);
    }
    public void fillPasswordName(String keyword){
        driver.findElement(passwordField).sendKeys(keyword);
    }
    public void click(){
        driver.findElement(loginButton).click();
    }


}


