package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public static WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		//local and global var is same so we use thismethod
		
	}
	//create message to verify title at every page
	public static void verifyTitle(String eTitle) {
		//use explicit wait to give diff conditions
		try {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs(eTitle));
			//if title is matched then display a message
			Reporter.log("Title is matching" +eTitle, true);
		}
		catch(Exception e) {
			Reporter.log("Title is not matching", true);
		}
		
	}
// write verification script for every element present ex dropbox, etc
	public static void verifyElementPresent(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present", true);
			
			}
		catch(Exception e) {
			Reporter.log("Element is not present", true);
		}
	}
	}


