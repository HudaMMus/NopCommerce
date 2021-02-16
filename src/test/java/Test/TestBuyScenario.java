package Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBuyScenario extends BaseTest{
  
  @BeforeTest
  public void beforeTest() {
	 // Open The web site
	  chromeDriver.navigate("https://frontend.nopcommerce.com/");
	  chromeDriver.maximize();
  }

  @Test ( testName="Add items to the cart" ,priority=1)
  public void TC1() throws Throwable {
	  chromeDriver.iframe1();
	  buyProcess.addCart1.click();
	  chromeDriver.iframe2();
	  
	  //Delay execution for 4 seconds 
	  Thread.sleep(4000);
	  buyProcess.confirmCart1.click();
	  Thread.sleep(5000);
	  buyProcess.homepageReturn.click();
	  buyProcess.addCart2.click();
	  Thread.sleep(3000);
	  buyProcess.shoppingCart.click();
	  Thread.sleep(3000);
	  buyProcess.termsCheckbox.click();
	  buyProcess.checkoutBtn.click();  
	  Thread.sleep(3000);
	  checkout.checkoutGuestBtn.click();
  }
  
  @Test (testName="Checkout as a guest process" , priority=2 , enabled=true, dependsOnMethods = {"TC1"})
  public void TC2() throws Throwable {
	  Thread.sleep(3000);
	  chromeDriver.iframe3();
	  checkout.firstName.sendKeys("H");
	  checkout.lastName.sendKeys("M");
	  checkout.email.sendKeys("test@test.com");
	  checkout.country.click();
	  checkout.city.sendKeys("Cairo");
	  checkout.address1.sendKeys("6 Street");
	  checkout.zipCode.sendKeys("02002");
	  checkout.phoneNumber.sendKeys("201112225552");
	  checkout.continueBtn1.click();
	  Thread.sleep(2000);
	  
	  checkout.continueBtn2.click();
	  Thread.sleep(2000);
	  
	  checkout.creditcardRadioBtn.click();
	  checkout.continueBtn3.click();
	  Thread.sleep(2000);
	  
	  checkout.cardholderName.sendKeys("Huda M");
	  checkout.cardNumber.sendKeys("4111 1111 1111 1111");
	  checkout.expireMonth.click();
	  checkout.expireYear.click();
	  checkout.cardCode.sendKeys("123");
	  checkout.continueBtn4.click();
	  Thread.sleep(3000);
	  
	  checkout.continueBtn5.click();
	  Thread.sleep(2000);
  }
  
  @Test (testName="Order success message" , priority=3 , enabled=true)
  public void TC3() throws Throwable {
	  Thread.sleep(3000);
	  chromeDriver.assertionConfirmOrder("Your order has been successfully processed!");
	  checkout.continueBtn6.click();
  }

  @AfterTest (enabled = true)
  public void afterTest() {
	  chromeDriver.quit(); 
  }

}
