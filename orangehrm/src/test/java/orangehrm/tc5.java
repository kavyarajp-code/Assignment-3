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

public class tc5 extends reporter {
  @Test
  public void f() throws InterruptedException, IOException {
	  logger = extent.startTest("Test5");
	  WebDriver driver=new EdgeDriver();

	  System.out.println("Test 5 is running");

	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(3000);
	  File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destFile=new File("C:\\Users\\Administrator\\Desktop\\Maven test\\orangehrm\\screenshotss\\image2");
	  Files.copy(srcFile,destFile);
	  
	  driver.quit();

	  logger.log(LogStatus.FAIL,"Test5 is failed");
	  assertTrue(true);
	  extent.endTest(logger);
  }
}
