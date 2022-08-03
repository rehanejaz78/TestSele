package form;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;


@Test
public class Form {


    public void first() {
        //download the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        //visit the site
        driver.get("https://formy-project.herokuapp.com/form");
        //find the element


        driver.findElement(By.id("first-name")).sendKeys("Rehan");
        driver.findElement(By.id("last-name")).sendKeys("Ejaz");
        driver.findElement(By.id("job-title")).sendKeys("Automation Engineer");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value = '1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("02/05/1998");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

      //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //close the browser

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement alert = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.className("alert")));

        String alertTXT = alert.getText();

        Assert.assertEquals("The form was successfully submitted!",alertTXT);



        driver.quit();



    }


    public static void main(String[] arg)  {

        Form obj = new Form();
        obj.first();

    }
}
