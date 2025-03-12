package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src\\test\\resources\\Feature\\Sample3.feature", // Correct path with lowercase .feature
    glue = {"StepDefinition","Hooks"}, // Package containing step definitions
    plugin = {"pretty", "html:target/cucumberReport/report.html"},// Plugins for reporting
//    tags = ("@SmokeTest or @SystemTest"),
    monochrome=true)
    
public class TestRunner extends AbstractTestNGCucumberTests {
}