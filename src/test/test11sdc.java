package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test11sdc {
	@Given("browser should be availble")
	public void browser_should_be_availble() {
	   System.out.println("chrome is installed");
	}

	@When("user opens the application")
	public void user_opens_the_application() {
	System.out.println("user clicks on the browser");    
	}

	@Then("browser opened")
	public void browser_opened() {
		System.out.println("browser opened");
	}

	@Given("user should have id")
	public void user_should_have_id() {
		System.out.println("only registered user");
	}

	@When("user enter id")
	public void user_enter_id() {
		System.out.println("id will be entered");
	}

	@Then("app logged in")
	public void app_logged_in() {
		System.out.println("it will be logged in");
	}

	@Given("user knows the product")
	public void user_knows_the_product() {
		System.out.println("identify the product");
	}

	@When("user adds the product")
	public void user_adds_the_product() {
		System.out.println("add the product to cart");
	}

	@Then("product shows in the cart")
	public void product_shows_in_the_cart() {
		System.out.println("product shown");
	}


}
