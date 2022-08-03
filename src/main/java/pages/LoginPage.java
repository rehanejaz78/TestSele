package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private By username= By.id("username") ;
    private  By password = By.id("password");
    private By loginButton= By.cssSelector("#login button");

    public void enterUserName(String uname){

        driver.findElement(username).sendKeys(uname);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
public SecurePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecurePage(driver);
}
    public WebDriver driver;
    LoginPage(WebDriver driver){
        this.driver = driver;
    }
}
