
package AssignmentDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
		
	public static void main(String[] args) 
				{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\16126\\eclipse-workspace\\SeleniumJavaProject\\exefiles\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("Button")).click();
			
			
			
			
			
			
			
			
			
			//driver findElement(By.name("button")).Click();
			//driver.findElement(By.name("Firstname")).gettext("John");
			//driver.findElement(By.name("Lastname")).gettext("Doe");
			//driver.findElement(By.Label("Mobile number or Email")).gettext("info@gmail.com");
			//driver.findElement(By.id("password_step_input")).gettext("abccdef");
			//driver.findElement(By.id("Month")).click(11);
			//driver.findElement(By.id("Day")).click(8);
			//driver.findElement(By.id("Year")).click(1985);
			//Could not do gender, need to understand.
			//Driver.findElement(By.name("Websubmit")).click();
			//System.out.println("Websubmit");
			driver.close();

	}

		

}
