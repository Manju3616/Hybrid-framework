package geniric;

import java.io.File;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_screenshot 
{
	public static void getsScreenShot(WebDriver driver)
	{
		try
		{
			String path ="./ScreenShot/";
		     java.util.Date d=new java.util.Date();
		     String d1 = d.toString();
		     String d2 = d1.replaceAll(":", "-");
		     TakesScreenshot tss=(TakesScreenshot)driver;
		     File srs = tss.getScreenshotAs(OutputType.FILE);
		     File dst = new File(path+d2+".png");
		     FileHandler.copy(srs, dst);
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		     
		}
	}
	
	

