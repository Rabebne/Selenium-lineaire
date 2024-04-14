package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		WebElement mylist = driver.findElement(By.id("cars"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, 400);", mylist);

		WebElement volvo = driver.findElement(By.xpath("//option[@value='volvo']"));
		WebElement opel = driver.findElement(By.xpath("//option[@value='opel']"));

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(volvo)
		.click(opel)
		.keyUp(Keys.CONTROL).build().perform();

	}

}
