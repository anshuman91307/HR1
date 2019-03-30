package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class GenericUtils extends BaseTest {
	public static void gSelectByIndex(WebElement element, int n) {
		Select select=new Select(element);
		select.selectByIndex(n);
	}
	public static void gSelectByvalue(WebElement element, String value)  {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public static void gSelectByvisibleText(WebElement element, String Tvalue)  {
		Select select=new Select(element);
		select.selectByVisibleText(Tvalue);
	}
	public static void hover(WebDriver driver,WebElement toElement){
		Actions action=new Actions(driver);
		action.moveToElement(toElement).perform();
	}
	// sorted scripts for new test
	public static void sortListBox(WebElement element) {
		Select select = new Select(element);
		List<WebElement> li = select.getOptions();
		//create array list to store in array list to store as we cannot directly sort ele in webelement. copy in array list then sort it
		ArrayList<String> ar=new ArrayList<String>();
		// need to have comparison so make one more array list for comparison
		ArrayList<String> arr1=new ArrayList<String>();
		// to sort the element use -forloop method
		for(int i=1;i<li.size();i++) {
			String st = li.get(i).getText();
			ar.add(st);
			arr1.add(st);
		}
		Collections.sort(ar);
		//to compare the elements
		for (int i=0;i<ar.size();i++) {
			if(!arr1.get(i).equals(ar.get(i))){
				Reporter.log("List is not sorted:fail", true);
			}
		}
		Reporter.log("List is sorted:Pass", true);
	}
}

