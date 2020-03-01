package february29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		Thread.sleep(3000);
		alert.sendKeys("Hello Pune");
		Thread.sleep(3000);
		alert.accept();
		
		driver.close(); // Closes the browser and script execution at console.
	}

}
