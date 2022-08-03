package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    public void first() {
        //download the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        //visit the site
        driver.get("https://formy-project.herokuapp.com/scroll");
        //find the element

        Actions action = new Actions(driver);

        WebElement firstname =  driver.findElement(By.id("name"));

        action.moveToElement(firstname);

        firstname.sendKeys("rehan");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/02/2020");







        //close the browser
       //driver.quit();


    }
    public static void main(String[] arg){
        BaseTest baseTest = new BaseTest();
        baseTest.first();
    }
}
