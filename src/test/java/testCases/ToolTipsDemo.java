package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipsDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		
		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTipText = text.getText();
		if(toolTipText.equals("Hover me to see")) {
			System.out.println("Pass:Tool tip Natching expacted value ");
		}else {
			System.out.println("fail:Tool tip not Natching expacted value ");
		}
		

	}

}
