package cucumber.testRunner;




import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "src\\test\\java\\Features",
		dryRun = false,
		glue = "cucumber.stepDefinations",
		monochrome=true,
		
		plugin= {"pretty","html:cucumberreport/index.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		  tags = "@sanity and regression"
		  )
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
