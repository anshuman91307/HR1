package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class HomePage extends BasePage {
		public HomePage (WebDriver driver){
			super(driver);
			PageFactory.initElements(driver, this);
		}
		//declare the elements and initialize and utilize them
		@FindBy(id="txtUsername")
		private WebElement userTxtBox;
		
		@FindBy(id="txtPassword")
		private WebElement pwdTxtBox;
		
		@FindBy(id="btnLogin")
		private WebElement loginBTN;
		
		// next is PIM module
		@FindBy (id="menu_pim_viewPimModule")
		private WebElement pim_menu;
		
		@FindBy (id="menu_pim_addEmployee")
		private WebElement addEmp_Menu;
		
		@FindBy(id="firstName")
		private WebElement fName;
		
		@FindBy(id="lastName")
		private WebElement lName;
		
		@FindBy(id="btnSave")
		private WebElement saveBtn;
		
		@FindBy(id="personal_txtEmpFirstName")
		private WebElement fName1;
		
		// create methods related to clicking operations to be performed here
		public void setUserName(String un) {
			userTxtBox.sendKeys(un);
		}
		public void setPwd(String pwd) {
			pwdTxtBox.sendKeys(pwd); 
		}
		public void clickLogin() {
			loginBTN.click();
		}
		public void clickPimMenu() {
			pim_menu.click();
		}
		public void clickAddEmpMenu() {
			addEmp_Menu.click();
		}
		public void setFirstName(String fn) {
			fName.sendKeys(fn);
		}
		public void setLastName(String ln) {
			lName.sendKeys(ln);
		}
		public void clickSaveBtn() {
			saveBtn.click();
		}
		//use assert method to perform verifcation on first name
		public void verifyFirstName(String eFn) {
			String aFn=fName1.getAttribute("value");
			//compare expected value to actual value
			Assert.assertEquals(aFn, eFn);
		}
		// close browser action we have already written in base test  now write test script
		
		// to verify list box sorted or not
		@FindBy(id="menu_pim_viewEmployeeList")
		private WebElement addEmpList_Menu;
		public void clickEmpListMenu() {
			addEmpList_Menu.click();
		}
		//to verify deleted employee from employee list
		
		/*@FindBy(id="ohrmList_chkSelectRecord_6")
		private WebElement checkBox;
		
		@FindBy(id="btnDelete")
		private WebElement deletBTN;
		
		@FindBy (id="empsearch_employee_name_empName")
		private WebElement fName1;
	
		public void clickCheckBox() {
			checkBox.click();
}
		public void clickDeleteBtn(){
			deletBTN.click();*/
}
		

