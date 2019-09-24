package utility;


import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;


public  class BaseTest { 
	public static WebDriver driver;
  
  @BeforeMethod
  public void openbrowser() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","E:\\Rajeev\\jarfiles\\geckodriver.exe" );
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://arrowenablement.com/na/");}
    @AfterMethod
  public void closebrowser() {
  driver.close();
}}
