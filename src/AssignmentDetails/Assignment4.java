package AssignmentDetails;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Chrome;
import org.openqa.selenium.WebDriver;

public class Assignment4 {

	public static WebDriver driver;

	public static <WebElement, list> void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.ebay.com/
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe\"");
		Chrome c = new Chrome();
		WebDriver a = new WebDriver();
		WebDriver.get("https://www.ebay.com");
		driver.findElement(By.id"gh-ac").Click();
		//dropdown
		driver.findElements(By.id("gh-cat"));

		Thread.sleep(3000);

		List =driver.findElements(By.id("gh-cat-box");
		
		{

		if(list.getText().equalsIgnoreCase("Consumer Electronics"))

		{

		driver.findElement(By.id("submit").click();

		break;
		
	
		
	}

}
