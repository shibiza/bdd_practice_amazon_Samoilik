package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example.stepdefinition"
        //    ��� ���:
        //      glue = {"org/example/stepdefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

