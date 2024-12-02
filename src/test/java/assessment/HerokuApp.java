package assessment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerokuApp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement click = driver.findElement(By.cssSelector("[href='/windows/new']"));
		click.click();
		
		@SuppressWarnings("unused")
		Set<String> tab = driver.getWindowHandles();

		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("New Window")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is Incorrect");
		}
	}
}
