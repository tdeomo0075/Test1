package Config;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class startBrowser {

	String method;
	public static WebDriver driver;
  public ExtentHtmlReporter htmlReporter;
  public static ExtentReports extent;
  public static ExtentTest parentTest;
  public static ExtentTest childTest;
  @BeforeMethod
  public  void methodName(Method method) {
	  parentTest=extent.createTest(method.getName());
  }
  @BeforeTest
  public void repor() {
	  htmlReporter=new ExtentHtmlReporter("E:\\Rajeev\\Eclipse\\Facebook\\Facebook\\src\\test\\resources\\Report//MyHtmlreport.html");
	  extent=new ExtentReports();
	  extent.attachReporter(htmlReporter);
  }
  @BeforeClass
  public void setUP() throws IOException {
	  System.setProperty("webdriver.gecko.driver","E:\\Rajeev\\jarfiles\\geckodriver.exe" );
		driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
	  extent.flush();
	  
  }

@AfterMethod
public void tearDown1(ITestResult result)
{
	
if(ITestResult.FAILURE==result.getStatus())
{
try 
{

TakesScreenshot ts=(TakesScreenshot)driver;

File source=ts.getScreenshotAs(OutputType.FILE);


FileUtils.copyFile(source, new File("E:\\Rajeev\\Eclipse\\Facebook\\Facebook\\src\\test\\resources\\Screenshot\\Screenshots.png"+result.getName()+".png"));

System.out.println("Screenshot taken");
} 
catch (Exception e)
{

System.out.println("Exception while taking screenshot "+e.getMessage());
} 

}

}
}



