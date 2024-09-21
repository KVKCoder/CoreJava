package StepDefiniton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition2 {
	
	@Before (order = 0)
	public void beforeStep() {		
		System.out.println("BEFORE HOOK EXAMPLE");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");	
	}
	
	
	@Before (order = 1)
	public void beforeStep_Order() {
		System.out.println("BEFORE HOOK EXAMPLE WITH ORDER");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
	@After
	public void afterStep() {		
		System.out.println("AFTER HOOK EXAMPLE");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");	
	}


	@After (order = 1)
	public void afterStep_Order() {
		System.out.println("After HOOK EXAMPLE WITH ORDER");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
	
	@Given("Launch Browser and URL for Hooks")
	public void launch_browser_and_url_for_hooks() {
	  System.out.println("Launch Browser and URL");
	  
	  System.out.println("=======================");
	}

	@Given("Click on My account for Hooks")
	public void click_on_my_account_for_hooks() {
		 System.out.println("Click on My account");
		 System.out.println("=======================");
	}

	@When("Enter the user details for Hooks")
	public void enter_the_user_details_for_hooks() {
		 System.out.println("Enter the user details");
		 System.out.println("=======================");
	}

	@Then("Capture screenshot for Hooks")
	public void capture_screenshot_for_hooks() {
		 System.out.println("Capture screenshot");
		 System.out.println("=======================");
	}


}
