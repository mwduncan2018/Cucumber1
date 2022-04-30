package duncan.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;

public class ContactSteps {

	@When("the Contact page is viewed")
	public void theContactPageIsViewed() {
		System.out.println("**** Inside step def -- the Contact page is viewed");
	}

	@Then("the following text should display in the footer")
	public void theFollowingTextShouldDisplayInTheFooter(String docString) {
		System.out.println("**** Inside step def -- the following text should display in the footer");
		System.out.println("**** Here is the docString");
		System.out.println("**** " + docString);
	}

	@Then("the following skills should be listed")
	public void theFollowingSkillsShouldBeListed(DataTable dataTable) {
		System.out.println("**** Inside step def -- the following skills should be listed");
	}

	@Then("a GitHub link should be provided")
	public void aGitHubLinkShouldBeProvided(String docString) {
		System.out.println("**** Inside step def -- a GitHub link should be provided");
		System.out.println("**** Here is the docString");
		System.out.println("**** " + docString);
	}
}
