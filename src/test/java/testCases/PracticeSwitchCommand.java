package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//Switching to the frame 
		driver.switchTo().frame("a77aa5e");
		System.out.println("we are switch to the iframe");
		
		
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();
		System.out.println("we are done");
		
		//driver.close();
	
				
	}

}
