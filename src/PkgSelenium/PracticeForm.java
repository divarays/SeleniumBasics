package PkgSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.demoqa.com/automation-practice-form/");
//		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Devyani");
		driver.findElement(By.id("lastName")).sendKeys("Bhardwaj");
		
		// =============== Radio Button handling ======================
		List<WebElement> list = driver.findElements(By.name("sex"));
		
		System.out.println(list.size());
		System.out.println(list);
		
		list.get(1).click();
		
		List<WebElement> yearsOfExp = driver.findElements(By.name("exp"));
		System.out.println(yearsOfExp);
		yearsOfExp.get(6).click();

		// =============== Checkbox handling ======================
		List<WebElement> profession = driver.findElements(By.name("profession"));
		System.out.println(profession.size());
		for (WebElement ele : profession) {
			ele.click();
		}
		
		// =============== Checkbox handling ======================
		List<WebElement> tools = driver.findElements(By.name("tool"));
		System.out.println(tools.size());
		for (WebElement tool : tools) {
			System.out.println("Value" + tool.getAttribute("value"));
			System.out.println("Type" + tool.getAttribute("type"));
			System.out.println("Text" + tool.getText());
		}
		
		for (WebElement tool : tools) {
			if (tool.getAttribute("value").contains("Selenium Webdriver"))
					tool.click();
		
		if (tool.getAttribute("value").contains("Selenium IDE"))
			tool.click();
		}
					
	}

}
