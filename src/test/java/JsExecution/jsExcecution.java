package JsExecution;
import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jsExcecution {

    public void first() throws InterruptedException {
        //download the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        //visit the site
        driver.get("https://formy-project.herokuapp.com/modal");
        //find the element

      WebElement modal = driver.findElement(By.id("modal-button"));
        modal.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",closeButton);

        Thread.sleep(2000);



        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform(); //we have to build and perform the actions

        Thread.sleep(2000);


        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radio1 = driver.findElement(By.id("radio-button-1"));

        radio1.click();
        Thread.sleep(1000);
        WebElement radio2 =  driver.findElement(By.cssSelector("input[value = 'option2']"));
        radio2.click();
        Thread.sleep(1000);

        WebElement  radio3 =  driver.findElement(By.xpath("//input[@value='option3']"));

        radio3.click();

        Thread.sleep(1000);


        //close the browser
        driver.quit();


    }
    public static void main(String[] arg) throws InterruptedException {
        jsExcecution baseTest = new jsExcecution();
        baseTest.first();
    }
}


