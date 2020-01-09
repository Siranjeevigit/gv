package maven1stproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pctest2 extends pctest {
	

	
		public static void main(String[] args) throws Throwable {
			
			
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\maven1stproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	WebElement usrn = driver.findElement(By.id("email"));

	usrn.click();

	usrn.sendKeys(data(0,1));

	}

		
	

}
