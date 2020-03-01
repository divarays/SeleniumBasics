package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Devyani");
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
	}

}
