package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	public WebDriver driver;
	public Checkout (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@value='Checkout as Guest']")
	public WebElement checkoutGuestBtn;
	
	@FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[1]/input")
	public WebElement firstName;
	@FindBy(xpath= "*//input[@id='BillingNewAddress_LastName']")
	public WebElement lastName;
	@FindBy(xpath= "*//input[@id='BillingNewAddress_Email']")
	public WebElement email;
	@FindBy(xpath= "//*[@id='BillingNewAddress_CountryId']/option[66]")
	public WebElement country;
	@FindBy(xpath= "//*[@id='BillingNewAddress_City']")
	public WebElement city;
	@FindBy(xpath= "//*[@id='BillingNewAddress_Address1']")
	public WebElement address1;
	@FindBy(xpath= "//*[@id='BillingNewAddress_ZipPostalCode']")
	public WebElement zipCode;
	@FindBy(xpath= "//*[@id='BillingNewAddress_PhoneNumber']")
	public WebElement phoneNumber;
	@FindBy(xpath= "//*[@id='billing-buttons-container']/input")
	public WebElement continueBtn1;
	
	@FindBy(xpath= "//*[@id='shipping-method-buttons-container']/input")
	public WebElement continueBtn2;
	
	@FindBy(xpath= "//*[@id='paymentmethod_1']")
	public WebElement creditcardRadioBtn;
	@FindBy(xpath= "//*[@id='payment-method-buttons-container']/input")
	public WebElement continueBtn3;
	
	@FindBy(xpath= "//*[@id='CardholderName']")
	public WebElement cardholderName;
	@FindBy(xpath= "//*[@id='CardNumber']")
	public WebElement cardNumber;
	@FindBy(xpath= "//*[@id='ExpireMonth']/option[3]")
	public WebElement expireMonth;
	@FindBy(xpath= "//*[@id='ExpireYear']/option[10]")
	public WebElement expireYear;
	@FindBy(xpath= "//*[@id='CardCode']")
	public WebElement cardCode;
	@FindBy(xpath= "//*[@id='payment-info-buttons-container']/input")
	public WebElement continueBtn4;
	
	
	@FindBy(xpath= "//*[@id='confirm-order-buttons-container']/input")
	public WebElement continueBtn5;

	@FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/input")
	public WebElement continueBtn6;
	
}
