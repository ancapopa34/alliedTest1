
package cucumber.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/registerWithSameUsername.feature",
        glue = "cucumber.stepDefinitions")

public class RegisterWithSameUsername {
}
