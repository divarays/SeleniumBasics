package PkgSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/* driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		WebElement textbox = driver.findElement(By.name("first_name"));
		textbox.sendKeys("Devyani");
		textbox = driver.findElement(By.name("last_name"));
		textbox.sendKeys("Bhardwaj");
		
		System.out.println(driver.getTitle());
		*/
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement textbox = driver.findElement(By.name("firstName"));
		textbox.sendKeys("Devyani");
		textbox = driver.findElement(By.name("lastName"));
		textbox.sendKeys("Bhardwaj");
		textbox = driver.findElement(By.name("phone"));
		textbox.sendKeys("123456");
		textbox = driver.findElement(By.name("email"));
		textbox.sendKeys("Email");
		textbox = driver.findElement(By.name("address1"));
		textbox.sendKeys("Hadapsar");
		textbox = driver.findElement(By.name("city"));
		textbox.sendKeys("Pune");
		textbox = driver.findElement(By.name("state"));
		textbox.sendKeys("Maharashtra");		
		textbox = driver.findElement(By.name("postalCode"));
		textbox.sendKeys("411028");
		
		textbox = driver.findElement(By.name("username"));
		textbox.sendKeys("dev123");
		textbox = driver.findElement(By.name("password"));
		textbox.sendKeys("test123");
		textbox = driver.findElement(By.name("confirmPassword"));
		textbox.sendKeys("test123");
		
		//driver.findElement(By.linkText("Sign-In")).click();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
	}

}
