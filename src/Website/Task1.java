package Website;

import POM.HomePageElements;
import POM.LogInPage;
import Utils.BaseDriver;
import org.testng.annotations.Test;

public class Task1 extends BaseDriver {

    HomePageElements homePageElements;
    LogInPage logInPage;


    @Test
    public void login() throws InterruptedException {

        homePageElements = new HomePageElements(driver);
        logInPage = new LogInPage(driver);

        String email = "can@can.com";
        homePageElements.logIn.click();
        logInPage.emailBox.sendKeys(email);
        logInPage.passwordBox.sendKeys("cancan");
        logInPage.loginButton.click();

        String actualCustomerEmail = homePageElements.customerInfo.getText();
        if (actualCustomerEmail.equals(email)) {
            System.out.println("You Logged In Successfully");
        } else {
            System.out.println("Dude?");
        }
    }

}
