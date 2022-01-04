package AssignmentDetails;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;


public class Assignment1 {

	

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\16126\\OneDrive\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();	
			driver.manage().window().maximize();
			driver.get("https://www.vitshr.com/");
			//Webdriver s= new webdriver(driver.findElement(By.tagname("a")));
			//Assert.assertEquals("Vits", "s");
			//If{
				//Webdriver= "Vits";
			//}
			//System.out.println("Pass");
			//Else {
				//System.out.println("Fail");	
			//}
			driver.get("www.facebook.com");
			driver.navigate().back();
			System.out.println("https://www.vitshr.com/");
			
			driver.close();		

	}

}