package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
       tags={"@smoke_test"},              // ~ used to ignore the feature to run
        features = {   "src/test/resources/features"  }, // to specify where are the features

        //feature contains scenarios // every scenario is like test
        glue = {   "com/vytrack/step_definition"  }, // where is the implementation for feature

        // dry run - to generate step definitions automatically
        // you will see them in console output
        dryRun = false
)
public class CukesRunner {


}
