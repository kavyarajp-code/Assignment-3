package testngdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {
	static WebDriver driver;
	static String nodeURL;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		nodeURL = "http://172.19.37.218:4444/wd/hub";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("MicrosoftEdge");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
