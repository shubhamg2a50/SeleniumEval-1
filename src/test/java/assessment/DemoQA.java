package assessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		// Click on Alert Button.
		WebElement alertbtn = driver.findElement(By.cssSelector("[id='alertButton']"));
		alertbtn.click();
		
		// Switch to Alert 
		Alert text = driver.switchTo().alert();
		
		// Check for Text contain Alert box.
		if(text.getText().equals("You clicked a button")) {
			System.out.println("Alert Text is Correct");
		}
		else {
			System.out.println("Alert Text is Incorrect");
		}
		// Accept Alert box.
		text.accept();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		
		driver.get("https://demoqa.com/frames");
		
		WebElement iframe = driver.findElement(By.cssSelector("[id='frame1Wrapper']"));
		driver.switchTo().frame(1);
		
		System.out.println(iframe.getText());
		
	}
}
