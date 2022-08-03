package LoginTests;

import Important.mainBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecurePage;

import java.security.SecureRandom;

@Test
public class LoginTests extends mainBase {

    public void TestSuccessfullLogin(){

LoginPage loginPage = homePage.clickFormLink();
       loginPage.enterUserName("tomsmith");
       loginPage.enterPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginButton();
        String alertText =  securePage.getAlertText();

        Assert.assertTrue(alertText.contains("You logged into a secure area!"));



    }




}
