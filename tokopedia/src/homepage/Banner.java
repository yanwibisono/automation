package homepage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Banner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tokopedia.com");
		// edited from eclipse by yan wibisono
	}

}
