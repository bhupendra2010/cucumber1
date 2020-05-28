package org.argos.com.StepDefinitionsPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.argos.com.PageObjectPackage.Homepage;

public class HomepageSteps {
    Homepage page=new Homepage();


    @Given("^user is on the home page$")
    public void user_is_on_the_home_page() throws Throwable {
        page.baseurl();
    }

    @When("^user type nike on search box$")
    public void user_type_nike_on_search_box() throws Throwable {
        page.searchproduct();
    }

    @Then("^user should see all the nike products$")
    public void user_should_see_all_the_nike_products() throws Throwable {

    }


}
