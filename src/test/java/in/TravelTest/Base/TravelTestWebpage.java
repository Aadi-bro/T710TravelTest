package in.TravelTest.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelTestWebpage {

	public static void main(String[] args) {

		WebDriver w = new ChromeDriver();
		w.get("https://travel-test-bug.vercel.app/");
	}

}
