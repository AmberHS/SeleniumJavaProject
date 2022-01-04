package AssignmentDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.Chromedriver;
import org.openqa.selenium.WebDriver;

public class Assignment3 {


	private static Object driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe\"");
		WebDriver WebDriver = new WebDriver();
		WebDriver.get("https://flipkart.com");
		WebDriver a = new WebDriver();
		WebDriver a1:(driver.findElements(By.tagname("div")).size());
		System.out.println(driver.findElements(By.tagname("div")).size());
		
		
		

	}

}
