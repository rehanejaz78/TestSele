package AutomationUniversityCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AMU1 {

    public void first(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");



        //clicking on link
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.cssSelector("a[href='/shifting_content/menu']")).click();

        int list = driver.findElements(By.tagName("li")).size();
        System.out.println(list);


    }

    public static void main(String[] args) {

        AMU1 obj = new AMU1();
        obj.first();


    }


}
