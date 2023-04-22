package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test

@CucumberOptions (plugin = {"pretty"}, tags = " ", features = "src/main/Features", glue = "StepDef")

public class RunnerClass extends AbstractTestNGCucumberTests {
}


