package StepDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition1 {

	@Given("Launch Browser and URL")
	public void launch_browser_and_url() {
	  System.out.println("Launch Browser and URL");
	  
	  System.out.println("=======================");
	}

	@Given("Click on My account")
	public void click_on_my_account() {
		 System.out.println("Click on My account");
		 System.out.println("=======================");
	}

	@When("Enter the user details")
	public void enter_the_user_details() {
		 System.out.println("Enter the user details");
		 System.out.println("=======================");
	}

	@Then("Capture screenshot")
	public void capture_screenshot() {
		 System.out.println("Capture screenshot");
		 System.out.println("=======================");
	}
}
