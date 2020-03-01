package february23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		Thread.sleep(3000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for (WebElement link : allLinks) {
			//if (link.getText() != "")
				System.out.println(link.getText()+ " --> "+ link.getAttribute("href"));
			// System.out.println(link.getAttribute("href"));

		}
		
		Thread.sleep(3000000);
		driver.close();
	}

}
