package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\dell\\IdeaProjects\\BDD_Cucumber_Framework\\src\\test\\java\\Features\\REx5_VerifyLoginButtonEnabled.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/cucumber-reports/SwagLabReports.html"}

)

public class SwagLabRunner extends AbstractTestNGCucumberTests
{
}
