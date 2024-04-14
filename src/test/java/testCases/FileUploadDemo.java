package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		// open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize browser
		driver.manage().window().maximize();

		// open url application
		String url = ("https://demo.guru99.com/test/upload/");
		driver.get(url);

		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\Mahdi\\Desktop\\test automatisation\\Test.txt");
	}

}
