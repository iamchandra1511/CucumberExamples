import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



// to import librarires ctrl+shift+o

public class LoginStep
{
	@Given("^user navigates to facebaook website$")
	public void user_navigates_to_facebaook_website() throws Throwable 
	{
	   System.out.println("@Given user navigates to facebook");
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable 
	{
	    System.out.println("@when user validates the homepage");
	}

	@Then("^user entered [a-zA-Z]{1,} username$")
	public void user_entered_valid_username() throws Throwable 
	{
		System.out.println("@then user entered valid username");
	} 

	@Then("^user entered [a-zA-Z]{1,} password$")
	public void user_entered_valid_password() throws Throwable 
	{
		System.out.println("@then user entered valid password");
	}

	@Then("^user [a-zA-Z]{1,} successfully logged in$")
	public void user_shouldbe_successfully_logged_in() throws Throwable 
	{
		System.out.println("@then user successfully logged in");
	}


}