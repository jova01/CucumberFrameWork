package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {   "src/test/resources/features"    }, // to specify where are the features

        //feature contains scenarios // every scenario is like test
        glue = {   "com/vytrack/step_definition/LoginStepDefinitions.java"  }, // where is the implementation for feature

        // dry run - to generate step definitions automatically
        // you will see them in console output
        dryRun = true
)
public class CukesRunner {


}
