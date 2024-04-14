package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");

		WebElement placeholder = driver.findElement(By.id("texFieldToolTopContainer"));
		String textplaceholder = placeholder.getAttribute("placeholder");
		System.out.println("the placeholder is:+textplaceHolder ");

	}

}