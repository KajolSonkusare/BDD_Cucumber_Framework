package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/FailedScenariosFiles/failed.txt",
        glue={"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/cucumber-reports/SampleReport.html"}
)
public class LoginRunner2_executeOnlyFailedScenario extends AbstractTestNGCucumberTests
{

}
