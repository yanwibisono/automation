package toped_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toped_Class {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tokopedia.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		//Check link: Tentang Tokopedia
		driver.findElement(By.xpath("//a[normalize-space()='Tentang Tokopedia']")).click();
		//Go to Homepage tab
			Object[] windowHandles=driver.getWindowHandles().toArray();
			driver.switchTo().window((String) windowHandles[0]);
		
		//CHeck link: Mitra Tokopedia
		driver.findElement(By.xpath("//a[normalize-space()='Mitra Tokopedia']")).click();
		//Go to Homepage tab
			driver.switchTo().window((String) windowHandles[0]);
		
		//Check link: Mulai Berjualan
		driver.findElement(By.xpath("//a[normalize-space()='Mulai Berjualan']")).click();
			driver.switchTo().window((String) windowHandles[0]);
			
		//Check link: Promo
		driver.findElement(By.xpath("//a[normalize-space()='Promo']")).click();
			driver.switchTo().window((String) windowHandles[0]);
		
		//Check link: Tokopedia Care
		driver.findElement(By.xpath("//a[normalize-space()='Tokopedia Care']")).click();
			driver.switchTo().window((String) windowHandles[0]);
		//ignore.
	}

}
