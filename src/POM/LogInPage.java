package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    public WebElement emailBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(css = "input[class='button-1 login-button']")
    public WebElement loginButton;

    @FindBy(css = "div[class='validation-summary-errors']")
    public WebElement invalidLoginText;

}
