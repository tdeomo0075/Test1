package script;

import org.testng.annotations.Test;

import Config.BaseClass;
import Po.RegistrationPo;
import utility.BaseTest;

public class Test2 extends BaseTest {
  @Test
  public void Registration() {
	  BaseClass b=new BaseClass();
	  b.launchapplication("https://arrowenablement.com/na/");
	  b.click(RegistrationPo.SignupBtn);
	  b.Type(RegistrationPo.FstnameBox,"Test");
	  b.Type(RegistrationPo.LstnameBox, "User");
	  b.Type(RegistrationPo.EmailBox, "teste10785@gmail.com");
	  b.Type(RegistrationPo.pwdBox,"123@123");
	  b.Type(RegistrationPo.ConfirmPwdBox, "123@123");
	  b.click(RegistrationPo.SbmtBtn);
	  
  }
}
