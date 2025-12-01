package orangehrm;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc3 extends reporter{
  @Test
  public void f() throws InterruptedException {
	  logger = extent.startTest("Test3");
	  WebDriver driver=new EdgeDriver();

	  System.out.println("Test 3 is running");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Admin")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("akukuku");
	  driver.findElement(By.xpath("orangehrm-left-space")).click();
	  
	  
	  driver.quit();
	  logger.log(LogStatus.PASS,"Test3 is pass");
	  assertTrue(true);
	  extent.endTest(logger); 
  }
}
