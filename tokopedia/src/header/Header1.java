package header;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tokopedia.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Open Tentang Tokopedia
		driver.findElement(By.xpath("//a[@class='css-1wx1rev'][normalize-space()='Tentang Tokopedia']")).click();
	}

}
