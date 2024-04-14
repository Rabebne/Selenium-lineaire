package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;



public class VerifyColor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url ="https://demoqa.com/buttons";
		driver.get(url);
		
		//get element color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("backgroun-color");
		Color color1 = Color.fromString(color);
		String actuelColor = color1.asHex();
		Assert.assertEquals("#007bff", actuelColor);
		
		System.out.println("The color of background :" + actuelColor);
		
		driver.quit();
		
		
		
		

	}

}
