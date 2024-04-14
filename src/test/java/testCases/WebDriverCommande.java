package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommande {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//	Open url avec une autre façon
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		
		String titlepage = driver.getTitle();
		int titlelengh = titlepage.length();
		System.out.println("title of the page is :" + titlepage);
		System.out.println("Lengh title of the title page is : "+ titlelengh);
		
		String actuelUrl = driver.getCurrentUrl();
		if (actuelUrl.equals(url)) {
			System.out.println("Verification successfull = The correct url is opned" );
			
		}else {System.out.println("Verification is failed - Incorrect url is opned");}
		System.out.println("Actuel url is :" + actuelUrl );
		System.out.println("expected url is :" +url);
		
		String sourcePage = driver.getPageSource();
		int lenghsourcePage = sourcePage.length();
		System.out.println("Lengh of the source page is :" + lenghsourcePage );
		
		driver.quit();		
		
		
	
		

	}

}
