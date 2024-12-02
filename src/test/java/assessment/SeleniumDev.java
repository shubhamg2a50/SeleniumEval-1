package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDev {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		// Check for Web Page Title.
		String title = driver.getTitle(); 
		if(title.equals("Selenium")) {
			System.out.println("Title is Correct");
		}
		else {
			System.out.println("Title is Incorrect");
		}
		
		// Click on the Download link
		WebElement downloadClick = driver.findElement(By.xpath("(//a[@href='/downloads'])"));
		downloadClick.click();
		
		// Check for URL contains.
		String url = driver.getCurrentUrl();
		if(url.contains("/downloads")) {
			System.out.println("Current URL is Correct");
		}
		else {
			System.out.println("Current URL is Incorrct");
		}
		
		driver.close();
	}
}
