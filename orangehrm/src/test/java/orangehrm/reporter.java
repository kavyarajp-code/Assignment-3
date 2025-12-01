package orangehrm;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class reporter {
  
  public static ExtentReports extent;
	public static ExtentTest logger;

@BeforeSuite
public void beforeSuite() {
	  extent=new ExtentReports("C:\\Users\\Administrator\\Desktop\\Maven test\\orangehrm\\testreport_ornagnehrm\\orangehrm_report.html ",true);
}

@AfterSuite
public void afterSuite() {
	  extent.flush();
	  extent.close();
}
}
