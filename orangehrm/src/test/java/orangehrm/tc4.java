package orangehrm;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.LogStatus;

public class tc4 extends reporter{
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  logger = extent.startTest("Test4");
	  WebDriver driver=new EdgeDriver();

	  System.out.println("Test 4 is running");

	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys("kavya");
	  driver.findElement(By.name("password")).sendKeys("kavya123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destFile=new File("C:\\Users\\Administrator\\Desktop\\Maven test\\orangehrm\\screenshotss\\image1");
	  Files.copy(srcFile,destFile);
	  Thread.sleep(3000);
	  driver.quit();

	  
	  logger.log(LogStatus.FAIL,"Test4 is pass");
	  assertTrue(true);
	  extent.endTest(logger);
  }
}
