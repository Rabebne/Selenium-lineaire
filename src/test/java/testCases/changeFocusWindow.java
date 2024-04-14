package testCases;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class changeFocusWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		WebElement btnNewWindow = driver.findElement(By.id("windowButton"));
		btnNewWindow.click();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		java.util.Iterator<String> i = handles.iterator();
		String parent = i.next();
		String child = i.next();

		driver.switchTo().window(parent);
		System.out.println("Page title parent: " + driver.getCurrentUrl());

		// validation enter in home page
		String textP = driver.findElement(By.xpath("//h1[normalize-space()='Browser Windows']")).getText();
		Assert.assertEquals(textP, "Browser Windows");

		driver.switchTo().window(child);
		System.out.println("Page title child: " + driver.getCurrentUrl());

		// validation enter in home page
		String textC = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		Assert.assertEquals(textC, "This is a sample page");
		


		
		

	}

}
