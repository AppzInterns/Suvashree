package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class steps {

	public WebDriver driver;
	public LoginPage lp;
	
    @Given("^Lunch chrome browser$")
    public void lunch_chrome_browser() throws Throwable {
    	System.setProperty("WebDriver.chrome.driver","/Drivers/chromedriver");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
        lp=new LoginPage(driver);
        
    }

    @When("^User open biskane url$")
    public void user_open_biskane_url() throws Throwable {
    	driver.get("https://qa.biskane.com");
    }
    @When("^Click on login$")
    public void click_on_login() throws Throwable {
        lp.clickOnLogin();
    }

    @And("^Click on login button and Enter Email and Password$")
    public void click_on_login_button_and_enter_email_and_password() throws Throwable {
       lp.loginButton();
       lp.setUserName();
       lp.setPassword();
    }
    @When("^Print all the menu links$")
    public void print_all_the_menu_links() throws Throwable {
       lp.menuLinks();
    }

    @When("^Click on Search and enter text$")
    public void click_on_search_and_enter_text() throws Throwable {
      lp.searchBox();
    }

    @Then("^Validate the home page logo$")
    public void validate_the_home_page_logo() throws Throwable {
       lp.homepageLogo();
    }

    @Then("^Verify that url gets displayed$")
    public void verify_that_url_gets_displayed() throws Throwable {
    	Assert.assertTrue(lp.validateUrl());
    }

    @Then("^Verify the title of this page$")
    public void verify_the_title_of_this_page() throws Throwable {
    	Assert.assertTrue(lp.validateShopPageTitle());
    }

    @Then("^Verify the name$")
    public void verify_the_name() throws Throwable {
    	lp.collectionName();
    }

    @And("^Print Current URL$")
    public void print_current_url() throws Throwable {
        lp.printUrl();
    }

    @And("^Click on shop now$")
    public void click_on_shop_now() throws Throwable {
        lp.clickShop();
    }

    @And("^Print the url$")
    public void print_the_url() throws Throwable {
       lp.printShopPageUrl();
    }

    @And("^Navigate back to home page$")
    public void navigate_back_to_home_page() throws Throwable {
       lp.homePageButton();
    }


    @And("^Click on the search result$")
    public void click_on_the_search_result() throws Throwable {
       lp.searchButton();
    }

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
        lp.close();
    }
    @When("^Click on Customer Signup link in Sign up dropdown$")
    public void click_on_customer_signup_link_insign_up_dropdown() throws Throwable {
        lp.clickSignup();
    }

    @When("^Enter data in to First Name,Last Name and Email field$")
    public void enter_data_in_to_first_namelast_name_and_email_field() throws Throwable {
       lp.textField();
    }

    @When("^User enter data in Password and Confirm Password$")
    public void user_enter_data_in_password_and_confirm_password() throws Throwable {
        lp.passwordField();
    }

    @When("^Click on I agree to The Terms of Service button$")
    public void click_on_i_agree_to_the_terms_of_service_button() throws Throwable {
        lp.clickOnAgree();
    }

    @When("^Enter data in to Contact Number field$")
    public void enter_data_in_to_contact_number_field() throws Throwable {
       lp.contactNo();
    }

    @Then("^Verify user is redirected to Customer Sign Up screen$")
    public void verify_user_is_redirected_to_customer_sign_up_screen() throws Throwable {
    	lp.CustomerPageTitle();
    }

    @Then("^Verify user is able to input data in First Name,Last Name and Email$")
    public void verify_user_is_able_to_input_data_in_first_namelast_name_and_email() throws Throwable {
    	Assert.assertTrue(lp.inputData());
    }

    @Then("^Verify the password and confirm password field$")
    public void verify_the_password_and_confirm_password_field() throws Throwable {
    	Assert.assertTrue(lp.password());
    }

    @Then("^Verify Sign up button is clickable or not$")
    public void verify_sign_up_button_is_clickable_or_not() throws Throwable {
    	Assert.assertTrue(lp.buttonClickable(null, driver));
    }

    @Then("^Verify data is entering or not$")
    public void verify_data_is_entering_or_not() throws Throwable {
    	Assert.assertTrue(lp.contactNoField());
    }

    @And("^Mouse hover on sign up menu$")
    public void mouse_hover_on_sign_up_menu() throws Throwable {
    	lp.signUpMenu();
    }

    @And("^Verify the form fields$")
    public void verify_the_form_fields() throws Throwable {
        lp.formFields();
    
}
    @When("^User Dont enter data in First Name field$")
    public void user_dont_enter_data_in_first_name_field() throws Throwable {
        lp.firstName();
    }

   

    @Then("^Verify the required validation message$")
    public void verify_the_required_validation_message() throws Throwable {
      lp.validationMessage();
    }

    
    
    }
