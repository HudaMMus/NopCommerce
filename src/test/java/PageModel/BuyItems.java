package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyItems {
	
	public WebDriver driver;
	public BuyItems (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "(//input[@value='Add to cart'])[2]")
	public WebElement addCart1;
	
	@FindBy(id= "add-to-cart-button-4")
	public WebElement confirmCart1;
	
	@FindBy(xpath= "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")
	public WebElement homepageReturn;
	
	@FindBy(css= ".item-box:nth-child(3) .product-box-add-to-cart-button")
	public WebElement addCart2;
	
	@FindBy(xpath= "//*[@id='topcartlink']/a/span[1]")
	public WebElement shoppingCart;
	
	@FindBy(xpath= "//*[@id='termsofservice']")
	public WebElement termsCheckbox;
	
	@FindBy(xpath= "//*[@id='checkout']")
	public WebElement checkoutBtn;	
	

}
