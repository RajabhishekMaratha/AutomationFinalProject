package cucumber.testRunner;




import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features ="src/test/java/Features", glue="stepDefinations",monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
