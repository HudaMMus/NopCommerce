package Test;

//import DriveDef.Chrome;
import DriveDef.Chrome;
//import DriveDef.FireFox;
import PageModel.BuyItems;
import PageModel.Checkout;

public class BaseTest {

	// Create a new instance of the Chrome driver
	public Chrome chromeDriver = new Chrome();
	
	// Create a new instance of Buy items class
	public BuyItems buyProcess = new BuyItems(chromeDriver.driver);
	
	// Create a new instance of Checkout class
	public Checkout checkout = new Checkout(chromeDriver.driver);
}
