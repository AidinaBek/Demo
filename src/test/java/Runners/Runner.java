package Runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-reports"},
        features = "src/test/resources",
        glue = "StepsDef",
        tags = "@Demo",
        dryRun = false
)

public class Runner {


}
