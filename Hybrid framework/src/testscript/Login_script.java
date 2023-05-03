package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import geniric.Fetch_Data;
import geniric.Generic_class;
import pom.Pom;

public class Login_script extends Generic_class
{
	@Test
	public void test1()
	{
		String un =Fetch_Data.get_data("Sheet1", 0, 0);
		String pwd =Fetch_Data.get_data("Sheet1", 0, 1);
		Pom p = new Pom(driver);
		p.username(un);
		Assert.fail();
		p.password(pwd);
		p.login_btn();
		
	}
}
