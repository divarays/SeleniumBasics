package february23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement dd = driver.findElement(By.id("select-demo"));
		
		Select obj = new Select(dd);
		
		obj.selectByIndex(2);
		obj.selectByValue("Friday");
		obj.selectByVisibleText("Sunday");
		
		
		
		Select multiDD = new Select(driver.findElement(By.name("States")));
		multiDD.selectByIndex(1);
		multiDD.selectByValue("New York");
		multiDD.selectByVisibleText("Ohio");
	
			
		List<WebElement> list = multiDD.getAllSelectedOptions();
		for (WebElement xyz : list) {
			System.out.println(xyz.getText());
		}

		//multiDD.deselectAll();

		Thread.sleep(20000);
		
		driver.close();
	}

}
