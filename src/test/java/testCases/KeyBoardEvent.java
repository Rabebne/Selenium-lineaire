package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullname = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		
		fullname.sendKeys("test");
		email.sendKeys("rabeb.neji@gmail.com");
		currentAddress.sendKeys("rue 6019");
		
		//copy pass
		currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAddress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		WebElement btnsubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", btnsubmit);
		

		// scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,600)", "");
		
		//driver.quit();
		



	}

}
