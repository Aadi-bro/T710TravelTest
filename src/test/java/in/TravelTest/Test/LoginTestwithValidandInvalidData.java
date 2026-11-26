package in.TravelTest.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import in.TravelTest.Page.LoginPage;

public class LoginTestwithValidandInvalidData {
	

	@Test (priority = 0)
	public void loginwithvalid() throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://travel-test-bug.vercel.app/");
		Thread.sleep(2000);
		LoginPage p = new LoginPage(w);
		p.login();
		Thread.sleep(2000);
		p.enterEmail("gautammandal001@yahoo.com");
		Thread.sleep(2000);
		p.enterPassword("9876543210");
		Thread.sleep(2000);
		p.rememberMe();
		Thread.sleep(2000);
		p.loginButton();
		Thread.sleep(2000);
		w.quit();
	}
	

@Test (priority = 1)

public void loginwithinvalid() throws Exception {
	
	WebDriver w = new ChromeDriver();
	w.get("https://travel-test-bug.vercel.app/");
	Thread.sleep(2000);
	LoginPage p = new LoginPage(w);
	p.login();
	Thread.sleep(2000);
	p.enterEmail("gautam@mandal001@yahoo.com");
	Thread.sleep(2000);
	p.enterPassword("9823453210");
	Thread.sleep(2000);
	p.rememberMe();
	Thread.sleep(2000);
	p.loginButton();
	Thread.sleep(2000);
	w.quit();
}


}













