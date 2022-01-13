package AssignmentDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment3 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16126\\eclipse-workspace\\SeleniumJavaProject\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.findElements(By.tagName("div")).size();
		System.out.println(driver.findElements(By.tagName("div")).size());
		
		
		

	}

}
