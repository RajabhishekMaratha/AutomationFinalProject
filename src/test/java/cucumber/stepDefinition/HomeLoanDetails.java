package cucumber.stepDefinition;
import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.PageObjectCucumber.PageObject;
import cucumber.hooks.DriverInstance;
import excelUtility.ExcelWrite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utility.ScreenShot;

public class HomeLoanDetails extends DriverInstance{
	static List <String> li;

	WebDriver driver;
	PageObject p = new PageObject(DriverInstance.getDriver());
	
	@Given("home loan details")
	public void home_loan_details() {
		DriverInstance.getLogger().info("valildating HomeLoan");
		 p.dropdown();//clicking the dropdown
		 p.clickHomeEmiCalculator();
		 li=p.getDetailsOfTheTable();
		 ScreenShot.takeScreenshot(DriverInstance.getDriver(), "homeLoanTable");
		 
		}
		
	@Given("writing home loan details into excel sheets")
	public void writing_home_loan_details_into_excel_sheets() {
		DriverInstance.getLogger().info("writing the values in the sheets");
		ExcelWrite ex=new ExcelWrite();
		ex.writeinTable(li);
	}
}
