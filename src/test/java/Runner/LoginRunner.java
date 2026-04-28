package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="C:\\Users\\dell\\IdeaProjects\\BDD_Cucumber_Framework\\src\\test\\java\\Features\\Ex12_RerunFailedScenarios.feature",
        glue = {"Steps","Hooks"},
        // tags = "@Sanity",
       // tags = "@Smoke",
        // tags = "@Regression",
        // tags = "@Sanity or @Smoke",
        //tags = "@Sanity and @Stability",
        //tags = "@Smoke and @Regression",
        //tags = "not @Smoke",
        publish = true,
        //plugin = {"pretty","html:target/cucumber-reports/SampleReport.html"}
        //plugin = {"pretty","html:Reports/cucumber-reports/SampleReport.html"},
        plugin = {"rerun:target/FailedScenariosFiles/failed.txt"}
        //dryRun = true
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
