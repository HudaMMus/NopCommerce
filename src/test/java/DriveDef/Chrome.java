package DriveDef;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome {
	public WebDriver driver;
	public File file = new File("F://PayMob//nopcommerce//Drivers//chromedriver.exe");
	public Chrome(){
		// System Property for chrome Driver 
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		this.driver = new ChromeDriver();
	}
	
	//Navigate 
	public void navigate(String URL ){
		//Navigate to the URL (Launch Website)
		this.driver.navigate().to("https://frontend.nopcommerce.com/");
	}

	public void maximize(){
		//Maximize current window
	    driver.manage().window().maximize();
	}
	
	
	public void quit(){
		//Close the browser after the test get finished
		this.driver.quit();
	}
	
	 //Switch to iframe which contain the elements we need 
	 public void iframe1() throws Throwable{
		 try
		 {
			//Switch by Index
		    driver.switchTo().frame(0);
		 }
		   catch(NoSuchFrameException e)
		 {
		   System.out.println(e.getMessage());
		 }
	 }
	
	 public void iframe2() throws Throwable{
	 try
	 {
	   driver.switchTo().frame(0);
	 }
	   catch(NoSuchFrameException e)
	 {
	   System.out.println(e.getMessage());
	 }
	 }
	 
	 public void iframe3() throws Throwable{
		 try
		 {
		  
		   driver.switchTo().frame(0);
		 }
		   catch(NoSuchFrameException e)
		 {
		   System.out.println(e.getMessage());
		 }
		 }
	 
    //Assertion function to make sure that the order has sone successfully
	public void assertionConfirmOrder (String SuccessMessage){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"))).getText();
		String expected = SuccessMessage;
		assertEquals(actual,expected);
		
	}
	

}
