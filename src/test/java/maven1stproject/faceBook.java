package maven1stproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook extends ExcelWrite  {
	
	public static void main(String[] args) throws Throwable {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth Ramasamy\\Downloads\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement usrName = driver.findElement(By.id("email"));
	
	usrName.sendKeys(getdata(1, 0));
	
	WebElement pass = driver.findElement(By.id("pass"));
	
	pass.sendKeys(getdata(2, 0));
	
	

}
}