package Retake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retake {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16126\\eclipse-workspace\\SeleniumJavaProject\\exefiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ambreensutarwala@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Suterking");
		driver.findElement(By.xpath("//*[@id=\"u_0_d_+F\"]")).click();
	

	}

}
