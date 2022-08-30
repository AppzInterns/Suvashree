package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver Idriver;
	public LoginPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);		
	}
	@FindBy(id="login")
	WebElement loginButton;

	@FindBy(id="name")
	WebElement textbox;

	@FindBy(id="password")
	WebElement textpassword;

	@FindBy(xpath="//*[@id=\"btn_send\"]")
	WebElement btnLogin;

	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div[1]/a/img[1]")
	WebElement homepageLogo;

	@FindBy(xpath="//*[@id=\"shop\"]")
	WebElement shopButton;

	@FindBy(id="home")
	WebElement homePageButton;

	@FindBy(xpath="//*[@autocomplete=\"new password\"]")
	WebElement searchBox;

	@FindBy(xpath="//*[@id=\"main\"]/app-elastic-search/section/div/div/div[3]/button")
	WebElement searchButton;

	@FindBy(xpath="//*[@class=\"box\"]")
	WebElement collectionName;

	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div[2]/nav[1]/ul/li[7]/a")
	WebElement signUpMenu;

	@FindBy(id="customerSignup")
	WebElement clickSignup;

	@FindBy(xpath="//*[@id=\"main\"]/section/div/div/div[2]/h3")
	WebElement customerPage;

	@FindBy(xpath="//*[@id=\"first_name1\"]")
	WebElement firstName;

	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement lastName;

	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailField;

	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement passwordField;

	@FindBy(xpath="//input[@name=\"confirmpassword\"]")
	WebElement confirmPassword;

	@FindBy(xpath="//*[@id=\"chek\"]")
	WebElement clickOnAgree;

	@FindBy(xpath="//button[@type=\"Submit\"]")
	WebElement signinButton;

	@FindBy(xpath="//input[@id=\"phone\"]")
	WebElement contactNo;

	@FindBy(xpath="//button[@id='btn_send']")
	WebElement submitButton;

	@FindBy(xpath="//span[normalize-space()='Only alphabets are allowed']")
	WebElement validationMessage;

	@FindBy(xpath="//div[@class='col-lg-6 loginbox']//div[2]//span[1]")
	WebElement errorMessage;
	
    @FindBy(xpath="//span[normalize-space()='Firstname must not exceed 50 characters']")
    WebElement maxCharFirstName;
    
    @FindBy(xpath="//*[@id=\"main\"]/section/div/div/div[2]/form/div[3]/span")
    WebElement lastNameErrorMsg;
    
    @FindBy(xpath="//span[normalize-space()='Lastname must not exceed 50 characters']")
    WebElement maxCharLastNameError;
    
    @FindBy(xpath="//span[normalize-space()='Only alphabets are allowed']")
    WebElement blankSpaceLastNameError;
    
    
	/**
	 * This method is to print url
	 * @throws InterruptedException 
	 */
	public void printUrl() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("url****" + Idriver.getCurrentUrl());

	}
	/**
	 * Verify the Home page Logo is visible
	 */
	public void homepageLogo() {
		// JavaScript executor to check image
		Boolean p = (Boolean) ((JavascriptExecutor)Idriver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", homepageLogo);
		//verify if status is true
		if (p) {
			System.out.println("Logo present");
		} else {
			System.out.println("Logo not present");
		}
	}
	/**
	 * Get list of web-elements with tagName  - a
	 * Traversing through the list and printing its text along with link address
	 * @throws InterruptedException
	 */
	public void menuLinks() throws InterruptedException {
		List<WebElement> allLinks = Idriver.findElements(By.tagName("a"));
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}}

	/**
	 * 
	 */
	public void loginButton() {
		loginButton.click();

	}
	public void setUserName() {
		textbox.sendKeys("pooja@katchintech.com");

	}
	public void setPassword() {
		textpassword.sendKeys("Cust@123");

	}
	public void clickOnLogin() {
		btnLogin.click();

	}
	/**
	 * This method is to click on shop button
	 */
	public void clickShop() {
		shopButton.click();

	}
	/**
	 * This method is to validate gets displayed
	 * @return
	 */
	public boolean validateUrl() {
		String actualUrl = Idriver.getCurrentUrl();
		String expectedUrl = "https://qa.biskane.com/shop-Indigenous";
		if(actualUrl.equals(expectedUrl))
			return true;
		else 
			return false;

	}
	/**
	 * This method is to print shop page url
	 * 
	 */
	public void printShopPageUrl() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Shop Page URL****" + Idriver.getCurrentUrl());	
	}
	/**
	 * This method is to validate page title
	 * @return
	 */
	public boolean validateShopPageTitle() {
		String actualSpTitle = Idriver.getTitle();
		String expectedSpTitle = "NATIVE AMERICAN AND INDIGENOUS ARTS";
		if(actualSpTitle.equals(expectedSpTitle))
			return true;
		else 
			return false;
	}
	/**
	 * This method is navigate back to home page
	 */
	public void homePageButton() {
		homePageButton.click();
	}
	/**
	 * This method is to click on search box and enter text to search box
	 */
	public void searchBox() {
		shopButton.click();
		searchBox.click();
		searchBox.sendKeys("Moozoons");

	}
	/**
	 * This method is to click on search
	 */
	public void searchButton() {
		searchButton.click();

	}
	/**
	 * This method is to verify collection name is displayed
	 * @return
	 */
	public void collectionName() {

		boolean display = collectionName.isDisplayed();

		if(display) {
			System.out.println("Collection name is displayed");
		}else {
			System.out.println("Collection name is not displayed");
		}
		/**
		 * This method is to close the browser
		 */
	}
	public void close() {
		Idriver.quit();

	}
	/**
	 * Instantiating Actions class
	 * Locating the element from signUpMenu and Mouse over on signUpMenu
	 * 
	 */
	public void signUpMenu() {
		Actions actions = new Actions(Idriver);
		actions.moveToElement(signUpMenu);
		actions.click().build().perform();
	}
	/**
	 * Click on sign up 
	 */
	public void clickSignup() {
		clickSignup.click();

	}
	public void CustomerPageTitle() {

		boolean customerPaged = customerPage.isDisplayed();

		if(customerPaged) {
			System.out.println("customerPage is displayed");
		}else {
			System.out.println("customerPage is not displayed");
		}
	}
	public void formFields() throws InterruptedException {

		Thread.sleep(5000);
		List<WebElement> links =Idriver.findElements(By.xpath("//*[@id=\"main\"]/section/div/div/div[2]/form"));
		System.out.println("Count number of form lists:"+links.size());

		for (WebElement categorieslinksText : links) {

			System.out.println("Form list names:"+categorieslinksText.getText());

		}
	}
	public void textField() {
		firstName.sendKeys("suvashree");
		lastName.sendKeys("swain");
		emailField.sendKeys("suvashree88@gmail.com");
	}

	/**
	 * This method is to verify product title is edited and changed
	 * @return
	 */
	public boolean inputData() {
		WebDriverWait wait = new WebDriverWait(Idriver, 30);
		return wait.until(ExpectedConditions.visibilityOf(firstName)).isDisplayed();
		//return wait.until(ExpectedConditions.visibilityOf(element("firstName"))).isDisplayed();

	}
	public void passwordField() {
		passwordField.sendKeys("suvashree");
		confirmPassword.sendKeys("suvashree123");
	}
	public boolean password() {
		WebDriverWait wait = new WebDriverWait(Idriver, 30);
		return wait.until(ExpectedConditions.visibilityOf(passwordField)).isDisplayed();

	}
	public void clickOnAgree() {
		clickOnAgree.click();

	}

	public boolean buttonClickable(WebElement signinButton, WebDriver Idriver) 
	{
		try{
			WebDriverWait wait = new WebDriverWait(Idriver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(signinButton));
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	public void contactNo() {
		contactNo.sendKeys("8043005570");

	}
	public boolean contactNoField() {
		WebDriverWait wait = new WebDriverWait(Idriver, 30);
		return wait.until(ExpectedConditions.visibilityOf(contactNo)).isDisplayed();
	}

	public void firstNamefield() {
		//Thread.sleep(5000);
		firstName.sendKeys("suvashree123");
		submitButton.click();


	}
	public void validationMessage() throws InterruptedException{
		Thread.sleep(3000);
		String actualError=validationMessage.getText();
		String expectedError="Only alphabets are allowed";
		Assert.assertEquals(actualError,expectedError);
		Assert.assertTrue(expectedError.contains("Only alphabets are allowed"));
		System.out.println("Test completed");

	}
	public void dontEnterFirstName() {
		firstName.sendKeys("");
		submitButton.click();
	}
	public void errorMessage() throws InterruptedException {
		Thread.sleep(3000);
		String actualError=errorMessage.getText();
		String expectedError="This field is required";
		Assert.assertEquals(actualError,expectedError);
		Assert.assertTrue(expectedError.contains("This field is required"));
		System.out.println("This field is required");

	}
	public void maxCharFirstName() {
		firstName.clear();
		firstName.sendKeys("abcdeffffffffdddddddddsdotscddhnhfddffghjhjioiuytrt");

	}
	public void errorMessageField() throws InterruptedException {
		Thread.sleep(3000);
		String actualError=maxCharFirstName.getText();
		String expectedError="Firstname must not exceed 50 characters";
		Assert.assertEquals(actualError,expectedError);
		Assert.assertTrue(expectedError.contains("Firstname must not exceed 50 characters"));
		System.out.println("Firstname must not exceed 50 characters");

	}
	public void blankSpaceFirstName() {
		firstName.clear();
		firstName.sendKeys("suvashree swain");

	}
	public void firstNameBlankSpace() throws InterruptedException {
		Thread.sleep(3000);
		String actualError=validationMessage.getText();
		String expectedError="Only alphabets are allowed";
		Assert.assertEquals(actualError,expectedError);
		Assert.assertTrue(expectedError.contains("Only alphabets are allowed"));
		System.out.println("Only alphabets are allowed");

	}
	public void dontEnterLastName() {
		lastName.sendKeys("");

	}
	public void verifyErrorLastName() {
		String actualError=lastNameErrorMsg.getText();
		String expectedError="This field is required";
		Assert.assertEquals(actualError,expectedError);
		Assert.assertTrue(expectedError.contains("This field is required"));
		System.out.println("This field is required");

	}
	public void maxCharLastName() {
		lastName.clear();
		lastName.sendKeys("abcdeffffffffdddddddddsdotscddhnhfddffghjhjioiuytrt");


	}
	public void verifyErrorMessageField() throws InterruptedException {
		Thread.sleep(3000);
		String actualError=maxCharLastNameError.getText();
		String expectedError="Lastname must not exceed 50 characters";
		Assert.assertEquals(actualError,expectedError);
		Assert.assertTrue(expectedError.contains("Lastname must not exceed 50 characters"));
		System.out.println("Lastname must not exceed 50 characters");
		

	}
	public void blankSpaceLastName() {
		lastName.clear();
		lastName.sendKeys("suvashree swain");

	}
	public void blankSpaceLastNameError() {
		String actualError=blankSpaceLastNameError.getText();
		String expectedError="Only alphabets are allowed";
		Assert.assertEquals(actualError,expectedError);
		Assert.assertTrue(expectedError.contains("Only alphabets are allowed"));
		System.out.println("Only alphabets are allowed");
	

	}

}
