
package AssignmentDetails;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Chrome;
import org.openqa.selenium.WebDriver;

public class Assignment2 {
		
		public static void main(String[] args, WebDriver WebDriver) {
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe\"");
			Chrome c = new Chrome();
			WebDriver  = new WebDriver();
			Object a;
			org.openqa.selenium.WebDriver.get("https://www.facebook.com");
			Driver findElement(By.tagname("button")).Click();
			Driver.findElement(By.name("Firstname")).gettext("John");
			Driver.findElement(By.name("Lastname")).gettext("Doe");
			Driver.findElement(By.Label("Mobile number or Email")).gettext("info@gmail.com");
			Driver.findElement(By.id("password_step_input")).gettext("abccdef");
			Driver.findElement(By.id("Month")).click(11);
			Driver.findElement(By.id("Day")).click(8);
			Driver.findElement(By.id("Year")).click(1985);
			//Could not do gender, need to understand.
			Driver.findElement(By.name("Websubmit")).click();
			System.out.println("Websubmit");
			Driver.close();

	}

		

}
