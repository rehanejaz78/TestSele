package checkbox;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Testcheckbox {

    public void first() {
        //download the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        //visit the site
        driver.get("https://formy-project.herokuapp.com/switch-window");
        //find the element
        WebElement newTab=  driver.findElement(By.id("new-tab-button"));
        newTab.click();

  String orignalTab =  driver.getWindowHandle();

        for (String handle :driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
   driver.switchTo().window(orignalTab);

    WebElement alert = driver.findElement(By.id("alert-button"));
alert.click();
        Alert alrt = driver.switchTo().alert();
        alrt.accept();



        //close the browser
        driver.quit();


    }


    public static void main(String[] arg){
        Testcheckbox newWindow = new Testcheckbox();
        newWindow.first();
    }
}
