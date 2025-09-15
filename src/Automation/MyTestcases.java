package Automation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcases extends myData {

	WebDriver driver =new EdgeDriver();

	String myWeb = "https://automationteststore.com/";
	String SignupPage ="https://automationteststore.com/index.php?rt=account/create";
	
	@BeforeTest
	public void mySetup() {
		driver.get(myWeb);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test(priority = 1,enabled = true)
	public void SignupTest() throws InterruptedException  {
		 
		
driver.navigate().to(SignupPage);

// webelements
 WebElement firstname = driver.findElement(By.id("AccountFrm_firstname"));

 WebElement lastname = driver.findElement(By.id("AccountFrm_lastname"));
 
 WebElement Email = driver.findElement(By.id("AccountFrm_email"));
 
 WebElement Phone = driver.findElement(By.id("AccountFrm_telephone"));
 WebElement Thefax = driver.findElement(By.id("AccountFrm_fax"));
 WebElement Theadress = driver.findElement(By.id("AccountFrm_address_1"));
 WebElement TheCountry= driver.findElement(By.id("AccountFrm_country_id"));
 WebElement TheState= driver.findElement(By.id("AccountFrm_zone_id"));
 WebElement ThePostalCode = driver.findElement(By.id("AccountFrm_postcode"));
 WebElement LoginName= driver.findElement(By.id("AccountFrm_loginname"));
 
 
 Select MyCountry =new Select(TheCountry);
 MyCountry.selectByIndex(108);
 Thread.sleep(3000);
 Select MyState =new Select(TheState);
 
 MyState.selectByIndex(theSelectStateIndex);
 
        List<WebElement>  ALLState   =   TheState.findElements(By.tagName("option"));
        
        
        String thecity = ALLState.get(theSelectStateIndex).getText();
        Thread.sleep(3000);
        WebElement theCityInput =driver .findElement(By.id("AccountFrm_city"));
        System.out.println(ALLState.get(theSelectStateIndex).getText());
        
        WebElement Passward= driver.findElement(By.id("AccountFrm_password"));
        WebElement ConfirmPassward= driver.findElement(By.id("AccountFrm_confirm"));
        WebElement CheckButton= driver.findElement(By.id("AccountFrm_agree"));
        WebElement CountinueButton = driver.findElement(By.xpath("//button[@title='Continue']"));

        
// actions
 firstname.sendKeys(TheFirstName);
 lastname.sendKeys(TheLastName);
 Email.sendKeys(TheEmail);
 Phone.sendKeys(TheTelphone);
 Thefax.sendKeys(TheFax );
 Theadress.sendKeys(Addressone);
 theCityInput.sendKeys(thecity);
 ThePostalCode.sendKeys(postalCode);
 LoginName.sendKeys(login);
 Passward.sendKeys( passward);
 ConfirmPassward.sendKeys(passward);
 CheckButton.click();
 CountinueButton.click();
 Thread.sleep(3000);
 
 String ActuallTextForSingup = driver.findElement(By.className("maintext")).getText();
 System.out.println("النص الفعلي المستخرج"+ ActuallTextForSingup);
 Assert.assertEquals( ActuallTextForSingup, ExpectedTextForSingup);
 
//	
//	String [] firstNames ={"baraa","maha", "dan"};
//	 System.out.println(firstNames[0]);
//	   List<String> myColor = new ArrayList<String>() ;
//	   myColor.add("red");
//	   myColor.add("green");
//	  System.out.println( myColor.get(0));
//	   
} 
     @Test(priority = 2 ,enabled = true)
	public void logout() throws InterruptedException {
		
		Thread.sleep(2000);
        driver.findElement(By.linkText("Logoff")).click();
		
		  Boolean ActucalValueForLogout  = driver.getPageSource().contains(ExpetedvaluetForlogout);
		  
		  Assert.assertEquals(ActucalValueForLogout, true);
		  
		  
		  
		  
	}
     @Test(priority = 3 ,enabled = true)
     public void Login() throws InterruptedException {
    	 
    	 
    	 
   	driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
    	 
//    	 driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a")).click();
    	 
    	 WebElement loginNameInput = driver.findElement(By.id("loginFrm_loginname"));
    	 WebElement PasswardInput  = driver.findElement(By.id("loginFrm_password"));
    	 WebElement LoginButtton  = driver.findElement(By.cssSelector("button[title='Login']"));
    	 loginNameInput.sendKeys(login);
    	 PasswardInput .sendKeys(passward);
    	 
    	 Thread.sleep(3000);
    	 LoginButtton .click();
    	 
    	 
    	 Boolean Actuallmessage = driver.getPageSource().contains(welcomeMessage);
    	 
    	 Assert.assertEquals(Actuallmessage, true);
    	 
//    	 System.out.println( driver.findElements(By.tagName("a")).size());
    	 
    	 
    	 
    	 
    	 
    	 
     }
	@AfterTest
	public void AfterMyTest() {
		
//		driver.close();
//		driver.quit();
		
		
	}
	
//	@Test 
//	public void Logout () {
		
//		                driver.findElement(By.linkText(SignupPage))
		
//	}
	
	
	

}