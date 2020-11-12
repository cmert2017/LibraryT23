package com.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
            "html:target/cucumber-report.html",
             "json:target/cucumber.json",
             "rerun:target/cucumber-rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/library/step_definitions",
        dryRun =false,
        tags = "@US2_AC2"
)
public class CucumberRunner {




}
