package stepDefination;



import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepDefination {
	 @Given("^user is on netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
		  System.out.println("i");
	    }

	 @When("^user login into application with \"([^\"]*)\" name and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_name_and_password_something(String a1, String a2) throws Throwable {
	        System.out.println(a1);
	        System.out.println(a2);
	    }


	    @Then("^home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	  System.out.println("am");
	    }
	    
	   

	    @And("^Cards are displyed \"([^\"]*)\"$")
	    public void cards_are_displyed_something(String q) throws Throwable {
	       System.out.println(q);
	    }
	    @When("^user signup with$")
	    public void user_signup_with(DataTable data) throws Throwable {
	       List<List<String>> obj=data.asLists();//previously cucumber use .raw() method insted of .asList() method 
	 System.out.println( obj.get(0).get(0))    ;
	 System.out.println( obj.get(0).get(1))    ;
	 System.out.println( obj.get(0).get(2))    ;
	 System.out.println( obj.get(0).get(3))    ;
	       
	    }
	  
	    
	    @When("^user is signup with (.+) and password is (.+)$")
	    public void user_is_signup_with_and_password_is(String jj, String kk) throws Throwable {
	    	System.out.println(jj);
	    	System.out.println(kk);
	    }

	    
	   




	   


}
