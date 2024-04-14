package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSwitchWindow {

	public static void main(String[] args) {
	

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.className("fc-button-label")).click();

		// store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		WebElement btnnewwindow = driver.findElement(By.id("messageWindowButton"));
		btnnewwindow.click();

		// store and print the of all the windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		// pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
		driver.switchTo().window(handle1);
		System.out.println(handle1);
		}
		
		
		
		

	}

}
