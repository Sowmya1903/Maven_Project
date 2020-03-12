package Test_cases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	 List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'http')]"));
	System.out.println(links.size());
	for(WebElement ele:links) {
		
		String link = ele.getAttribute("href");
		 
			 
		 
		URL u = new URL(link);
		
	HttpURLConnection conn = (HttpURLConnection)u.openConnection();
	if(conn.getResponseCode()==200)
	{
		System.out.println(conn.getResponseMessage());
		System.out.println("Link is not broken");
	}
	else
	{
		System.out.println("Link is broken");
	}
		 }
		
	
	
	
}

	
	
	}
	
	
	
	

