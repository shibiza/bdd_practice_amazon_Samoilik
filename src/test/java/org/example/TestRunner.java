package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepefinition"}
        //    или так:
        //      glue = {"org/example/stepdefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}