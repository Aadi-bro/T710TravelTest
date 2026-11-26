package in.TravelTest.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	
//	Webelement
	@FindBy(linkText = "Login") WebElement loginLink;
	@FindBy(id = "login-email-input") WebElement email;
	@FindBy(id = "login-password-input") WebElement password;
	@FindBy(css = "button[data-testid=\"login-password-toggle-button\"]") WebElement showPassword;
	@FindBy(id = "login-remember-checkbox") WebElement rememberMe;
	@FindBy(linkText = "Forgot password?") WebElement forgetPassword;
	@FindBy(css = "button[data-testid=\"login-submit-button\"]") WebElement loginButton;
	@FindBy(css = "a[data-testid=\"register-login-link\"]") WebElement createAccount;
	
//	/Annotation ---> variable, method class
//	class
	
	public void login() {
		loginLink.click();
	}
	
	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}
	public void clearEmail() {
		email.clear();
	}
	
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	public void clearPassword() {
		password.clear();
	}
	
	public void showPassword() {
		showPassword.click();
	}
	
	public void rememberMe() {
		rememberMe.click();
	}
	
	public void forgetPassword() {
		forgetPassword.click();
	}
	
	public void loginButton() {
		loginButton.click();
	}
	
	public void createAccount() {
		createAccount.click();
	}
	
	
	
	
	

}
