package Website;

import POM.HomePageElements;
import POM.LogInPage;
import Utils.BaseDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class Task3 extends BaseDriver {

    HomePageElements homePageElements;
    LogInPage logInPage;


    @Test
    public void invalidLogin() throws InterruptedException {

        homePageElements = new HomePageElements(driver);
        logInPage = new LogInPage(driver);

        String email = "can@can.com";
        homePageElements.logIn.click();
        logInPage.emailBox.sendKeys(email);
        logInPage.passwordBox.sendKeys("cancan");
        logInPage.loginButton.click();

        homePageElements.firstProductToGo.click();
        homePageElements.recipientName.sendKeys("Can");
        homePageElements.recipientEmail.sendKeys("can@can.com");
        homePageElements.addToCart.click();
        homePageElements.shoppingCartButton.click();
        homePageElements.termsOfServiceBox.click();
        homePageElements.checkoutBox.click();
        Select dropCountry = new Select(homePageElements.countryDropBox);
        dropCountry.selectByVisibleText("United States");
        homePageElements.cityBox.sendKeys("Izmir");
        homePageElements.address1.sendKeys("Izmirin ici");
        homePageElements.zipCodeBox.sendKeys("35000");
        homePageElements.phoneNumberBox.sendKeys("123456789");
        homePageElements.continueForAddress.click();
        homePageElements.continueButtonForPayment.click();
        homePageElements.continueButtonForPaymentInfo.click();
        homePageElements.confirmButton.click();

        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = homePageElements.successMessage.getText();

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Canerin gotunu sikeyim");
        } else {
            System.out.println("Dude?");
        }




    }
}
