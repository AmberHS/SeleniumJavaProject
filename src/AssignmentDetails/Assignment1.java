package AssignmentDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\16126\\eclipse-workspace\\SeleniumJavaProject\\exefiles\\geckodriver.exe");
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

//