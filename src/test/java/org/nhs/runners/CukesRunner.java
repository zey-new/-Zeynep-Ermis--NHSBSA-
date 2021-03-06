package org.nhs.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",  "json:target/cucumber.json", "rerun:target/rerun.txt" },
        features = {"src/test/resources/features"},
        glue = {"org/nhs/step_definitions"},
        dryRun = false
)
public class CukesRunner {
}
