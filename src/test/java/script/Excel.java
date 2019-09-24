package script;

import java.io.Reader;

import org.testng.annotations.Test;

import Config.BaseClass;
import Po.LoginPo;
import utility.BaseTest;

public class Excel extends BaseTest {
  @Test
  public void Login() {
	  String xlpath="E:\\Rajeev\\Eclipse\\Arrow_workspace\\TestProject\\TestData\\Login.xlsx";
	  String sheet="Login";
       BaseClass b=new BaseClass();
	  b.launchapplication("https://arrowenablement.com/na/");
	  b.Type(LoginPo.unTextBox,Reader.getcellData(""));
		 b.Type(LoginPo.pwTextBox,"demos123");
		 b.click(LoginPo.loginButton);
  }}
	  


  

	  
	
	
	
	
	
	
	
	
	 

