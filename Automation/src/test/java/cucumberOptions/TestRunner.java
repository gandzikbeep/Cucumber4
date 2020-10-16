package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = "stepDefinition",
        //dryRun = true,

        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/Cucumber.html"
        }

        // tags = "@SmokeTest or @MobileTest or @RegTest"
        // tags = "@PortalTest",
)
public class TestRunner {
}
