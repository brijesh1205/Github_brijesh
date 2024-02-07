package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xyz {

	public static void main(String[] args) {
     
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String baseurl = "https://www.amazon.in/";
		driver.get(baseurl);
		
		

	}

}
