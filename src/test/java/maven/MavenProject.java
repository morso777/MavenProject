package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenProject {
	
	
	
	public static void main(String[] args) {
			
			// TODO Auto-generated method stub		
			String service = "C:\\Users\\vohir\\Documents\\Programas\\chromedriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", service);
			ChromeDriver driver = new ChromeDriver();
			
			// abrir https://www.commscope.com/ and maximize the window browser.
			driver.get("https://www.commscope.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			//cerrar cookies
			driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();
			
			// Type product ME-7000 and access to the page about it.
			
			 driver.findElement(By.name("searchquery")).sendKeys("ME-700");
			
			 		
			 driver.findElement(By.xpath(" /html/body/header/div[2]/div/div[1]/form[1]/button")).click();
			 				 
			 
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			  jse.executeScript("window.scrollBy(0,500)");
			  
			  
			  driver.findElement(By.xpath("//*[@id='results-area']/div[3]/div/div/div/div[1]/a[1]/img")).click();
			
			  //Click the image of the product and close the image viewer.
			  
			  driver.findElement(By.xpath("//*[@id='Product']/div[2]/section[2]/div[1]/div/button")).click();
			  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			  
			  driver.findElement(By.xpath("//*[@id='ProductImageGallery']/div/div/div/button")).click();
	}
	}



