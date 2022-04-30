package duncan;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html"},
		tags = "", // Execute tagged features and scenarios
		glue = { "duncan.steps", // Look for step definitions and hooks in these packages
				"duncan.hooks",
				"duncan.customdatatypes",
				"duncan.customparametertypes" },
		features = "src/test/resources/features", // Look for features in this folder
		snippets = CucumberOptions.SnippetType.CAMELCASE, // Generate snippets in camcelcase or with underscores
		dryRun = false, // When Cucumber runs, just print the missing step defs
		monochrome = false // Print to the console without color
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

	// Parallel execution
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	
	// Maven will execute all the hooks below
	
	@BeforeAll // Cucumber CLI will execute this
	public static void beforeAll() {
		System.out.println("\nInside Cucumber beforeAll()\n");
	}

	@BeforeClass // Cucumber CLI will not execute this method
	public void beforeClass() {
		System.out.println("\nInside TestNG beforeClass()\n");
	}

	@AfterClass // Cucumber CLI will not execute this method
	public void afterClass() {
		System.out.println("\nInside TestNG afterClass()\n");
	}
	
	@AfterAll // Cucumber CLI will execute this
	public static void afterAll() {
		System.out.println("\nInside Cucumber afterAll()\n");
	}
}