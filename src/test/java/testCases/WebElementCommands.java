package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		
		// open chrome browser
				WebDriver driver = new ChromeDriver();

				// Implicit wait
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Maximize browser
				driver.manage().window().maximize();
				
				// open url application
				String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";		
				driver.get(url);

				// clear field
				WebElement email = driver.findElement(By.id("Email"));
				email.clear();

				// Fill email
				driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
				String attvalue = 

				// clear field
				driver.findElement(By.id("Password")).clear();
				
				// Fill password
				driver.findElement(By.id("Password")).sendKeys("admin");
				
				// Click on login button
				driver.findElement(By.xpath("//button[@type'submit']")).click();
				
				//Vérifier si le boutton affiché vrai / faux
				boolean 
				
				//Vérifier si le boutton activé vrai / faux
				
				//Vérifier si le boutton existe vrai / faux
				List<WebElement> btnlogin = driver.findElements(By.xpath("//button[@type'submit']"))>
				
				
				
				
				
				
	}

}
