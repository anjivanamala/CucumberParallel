import io.cucumber.junit.platform.engine.Cucumber;
//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@Cucumber
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@smokeTest"
)

public class RunCucumberTest {
}
