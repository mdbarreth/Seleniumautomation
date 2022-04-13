package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// In TestRunner.java
import io.cucumber.junit.Cucumber;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import org.junit.runner.RunWith;

public class stepDefinitions {

  @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("Navigated to login url");
    	System.out.println("Git things");
    	
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Logged in success");
    	System.out.println("Git things");
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        System.out.println("Validated Homepage");
        System.out.println("Git develop branch");
    }
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	System.out.println("Git things");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println("Git things");
    }
   public void getdevelopbranch()
   {
	   System.out.println("Verify develop branch");
   }
    
    }
