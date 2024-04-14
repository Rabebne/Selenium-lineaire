package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilFildUsingJavaScript {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)","");
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getelementByid('user name'.value ='test';");
		executor.executeScript("document.getelementByid('user email'.value ='rabebneji@gmail.com';");
		executor.executeScript("document.getelementByid('current adresse'.value ='54 rue 6019';");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement currentAdresse;
		currentAdresse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currentAdresse")));
		
		WebElement parmenentAdresse;
		parmenentAdresse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("parmenentAdresse")));
		
		
		
		
		
		
		
		
		
		
		
		

	}

		
	}


