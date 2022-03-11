package stepdefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartStepDef {
	WebDriver driver;

	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com/");
	}

	@Given("User Navigates to Login Page")
	public void user_navigates_to_login_page() {
	system.out.println("CR test update");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {

	}

	@Then("User Navigate to My Account Page")
	public void user_navigate_to_my_account_page() {

	}

	@Given("Should display My Account Page")
	public void should_display_my_account_page() {
		
	}

	@When("User search an Item")
	public void user_search_an_item(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new io.cucumber.java.PendingException();
	}

	@Then("Should display search result page")
	public void should_display_search_result_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Should display search result page")
	public void should_display_search_result_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("User Add Item to cart")
	public void user_add_item_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Item must be available in Cart")
	public void item_must_be_available_in_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
