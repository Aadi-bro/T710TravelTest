package in.TravelTest.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.TravelTest.Page.LoginPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		LoginPage login = new LoginPage(w);
		w.get("https://travel-test-bug.vercel.app/");
		Thread.sleep(2000);
		login.login();
		Thread.sleep(2000);
		login.enterEmail("gautammandal001@yahoo.com");
		Thread.sleep(2000);
		login.enterPassword("9876543210");
		Thread.sleep(2000);
		login.showPassword();
		Thread.sleep(2000);
		login.rememberMe();
		Thread.sleep(2000);
		login.loginButton();		
	}
//		Standard pom ---> By class and Findelement method
//	pageFactory ---> pagefactory class and @findby annotation
}
