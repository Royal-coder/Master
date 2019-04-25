package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\satnalika\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("Hello:");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input#remember")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		

	}

}
