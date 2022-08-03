package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");


    public DropDown(WebDriver driver) {
        this.driver = driver;
    }



}
