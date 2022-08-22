package POM;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    public HomePageElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[href='/login']")
    public WebElement logIn;

    @FindBy(css = "a[href='/customer/info']")
    public WebElement customerInfo;

    @FindBy(css = "input[value='Add to cart']")
    public WebElement firstProductToGo;

    @FindBy(id = "giftcard_2_RecipientName")
    public WebElement recipientName;

    @FindBy(id = "giftcard_2_RecipientEmail")
    public WebElement recipientEmail;

    @FindBy(id = "add-to-cart-button-2")
    public WebElement addToCart;

    @FindBy(css = "span[class='cart-label']")
    public WebElement shoppingCartButton;

    @FindBy(id = "termsofservice")
    public WebElement termsOfServiceBox;

    @FindBy(id = "checkout")
    public WebElement checkoutBox;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement countryDropBox;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement cityBox;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement address1;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipCodeBox;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(css = "input[class='button-1 new-address-next-step-button']")
    public WebElement continueForAddress;

    @FindBy(css = "input[class='button-1 payment-method-next-step-button']")
    public WebElement continueButtonForPayment;

    @FindBy(css = "input[class='button-1 payment-info-next-step-button']")
    public WebElement continueButtonForPaymentInfo;

    @FindBy(css = "input[class='button-1 confirm-order-next-step-button']")
    public WebElement confirmButton;

    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    public WebElement successMessage;






}
