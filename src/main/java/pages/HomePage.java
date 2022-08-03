package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By formlink = By.cssSelector("a[href='/login']");
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver= driver;
    }

    public LoginPage clickFormLink(){

       ClickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDown clickDropDown(){
        ClickLink("Dropdown");
        return new DropDown(driver);
    }

    public void ClickLink(String link){
        driver.findElement(By.linkText(link)).click();

    }

}
