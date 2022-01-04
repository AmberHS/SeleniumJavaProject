
package AssignmentDetails;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
		
		public static void main(String[] args, WebDriver WebDriver) {
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe\"");
			WebDriver driver  = new ChromeDriver();
			driver.get("https://www.facebook.com");
			//driver.findElement(By."button")).click();
			driver.findElement(By.tagName("Button"));
			driver.findElement(By.name("Firstname")).getText();
			driver.findElement(By.name("Lastname")).getText();
			driver.findElement(By.className("Mobile number or Email")).getText();
			driver.findElement(By.id("password_step_input")).getText();
			driver.findElement(By.id("Month"))
			
			
		
			
			Driver.findElement(By.id("password_step_input")).gettext("abccdef");
			Driver.findElement(By.id("Month")).click(11);
			Driver.findElement(By.id("Day")).click(8);
			Driver.findElement(By.id("Year")).click(1985);
			//Could not do gender, need to understand.
			Driver.findElement(By.name("Websubmit")).click();
			System.out.println("Websubmit");
			Driver.close();

	}

		private static By By(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		

}
