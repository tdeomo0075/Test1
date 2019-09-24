package script;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.BaseClass;
import Config.ExtentReportDemo;
import Po.LoginPo;
import utility.BaseTest;

public class Test1 extends BaseTest{

  @Test
  public void Login() throws IOException {
	  BaseClass b=new BaseClass();
	  b.login("testengi123@gmail.com","demos123");
	  
	 
	  
  }
}
