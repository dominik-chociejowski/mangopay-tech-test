import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Search.feature",
        glue = "",
        plugin = {
                "pretty",
                "html:target/cucumber/reports/report.html",
                "json:target/cucumber/reports/cucumber.json"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
