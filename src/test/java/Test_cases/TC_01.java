package Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	@Test
	
public void test()
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.selenium.dev");
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}
}
