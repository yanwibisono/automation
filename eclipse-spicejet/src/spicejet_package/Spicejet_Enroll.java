package spicejet_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet_Enroll {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open Spice Jet Enrollment page
		driver.get("https://www.spicejet.com/profile/sign-up");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//input Title
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Mrs')]")).click();
			
		//input First Name
		driver.findElement(By.xpath("//input[@placeholder='e.g. John']")).sendKeys("Jennifer");
		
		//input Last Name
		driver.findElement(By.xpath("//input[@placeholder='Doe']")).sendKeys("Lawrence");
		
		//input Country
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[2]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("indo");
			driver.findElement(By.xpath("//div[@class='css-76zvg2 r-qsz3a2 r-n6v787 r-1e081e0 r-oyd9sg']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		//input DOB	
		driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).click();
			driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-adyw6z r-1kfrs79']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'1994')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Jul')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
			
		//input Contact Number
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("indo");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-18u37iz r-1e081e0 r-oyd9sg']")).click();
			driver.findElement(By.xpath("//input[@placeholder='e.g. 9876-453-010']")).sendKeys("8123999944");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//input Password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Jane123#");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Jane123#");
		
		//input Email
		driver.findElement(By.xpath("//input[@placeholder='johndoe@example.com']")).sendKeys("jlawrence12674@gmail.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//click I agree
		driver.findElement(By.xpath("//*[name()='rect' and contains(@width,'100%')]")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//page scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//click Enroll
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-9qu9m4 r-ah5dr5 r-1otgn73']")).click();
		
		//quit
		//driver.quit();
	}

}
