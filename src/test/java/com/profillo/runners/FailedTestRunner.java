package com.profillo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
        features = "@targer/rerun.txt",
        glue = "com/profillo/step_definitions"
)
public class FailedTestRunner {
}
