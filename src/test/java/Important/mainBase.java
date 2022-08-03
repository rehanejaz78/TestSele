package Important;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;

public class mainBase {

    protected HomePage homePage;

    private WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //create instance of chrome driver
         driver = new ChromeDriver();

        //visit the site
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }

    @AfterClass
    public void quitBrowser(){
        driver.quit();
    }


}
