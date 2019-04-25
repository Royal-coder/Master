package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satnalika\\Downloads\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\satnalika\\\\Downloads\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com"); // Hit the URL
		
		driver.getTitle();//Get the title of the page
		
		driver.getCurrentUrl();//get the current URL
		
		//System.out.print(driver.getPageSource());//Print page source
		driver.get("http://test.salesforce.com");
		//driver.navigate().back();
		//driver.close(); //It closes current window
		//driver.quit();//It closes all the browsers opend by selenium script
		driver.findElement(By.id("username")).sendKeys("meankitsatnalika@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Master!!!!");
		driver.findElement(By.id("Login")).click();
		System.out.print(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
	}

}
