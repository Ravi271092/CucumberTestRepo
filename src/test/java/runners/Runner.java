package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//OpenCart.feature"
		//,glue = {"stepdefs"}
		,dryRun = false
		,monochrome= true
		,plugin = {"pretty"}
		
		)

public class Runner extends AbstractTestNGCucumberTests{
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();		
	}

}
