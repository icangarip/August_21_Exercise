package Website;

import POM.HomePageElements;
import POM.LogInPage;
import Utils.BaseDriver;
import org.testng.annotations.Test;

public class Task2 extends BaseDriver {
    HomePageElements homePageElements;
    LogInPage logInPage;


    @Test
    public void invalidLogin() throws InterruptedException {

        homePageElements = new HomePageElements(driver);
        logInPage = new LogInPage(driver);

        String email = "can@ca2n.com";
        homePageElements.logIn.click();
        logInPage.emailBox.sendKeys(email);
        logInPage.passwordBox.sendKeys("cancan");
        logInPage.loginButton.click();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = logInPage.invalidLoginText.getText();
        //System.out.println(actualText);
        if (actualText.equals(expectedText)) {
            System.out.println("Passed");
        } else {
            System.out.println("Dude?");
        }
    }
}
