package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Selenium Easy")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(3000000);
		driver.close();
		
	}

}
