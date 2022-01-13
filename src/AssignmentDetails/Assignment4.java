package AssignmentDetails;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {


	public static <WebElement, list> void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//https://www.ebay.com/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16126\\eclipse-workspace\\SeleniumJavaProject\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
	    driver.findElement(By.id("gh-ac")).click();
		//dropdown
		driver.findElements(By.id("gh-cat"));

		Thread.sleep(3000);

	driver.findElements(By.id("gh-cat-box"));
	driver.findElement(By.id("submit")).click();
		
		//{

		//if(list.getText().equalsIgnoreCase("Consumer Electronics"))

		//{

	//driver.findElement(By.id("submit")).click();
	

		//break;
		
	
		
	}

}
