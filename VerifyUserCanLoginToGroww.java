package testclasses;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import baseclasses.Base_Class;
import pomclasses.Login_Page;
import utilityclasses.Util_Class;

public class VerifyUserCanLoginToGroww extends Util_Class{
	 WebDriver driver=null;
	 //rashmi===test_branch
	 Login_Page lp;
	 ExtentTest test;
	 ExtentReports report;
	 @Parameters({"Browser"})
	@BeforeClass
	public void BrowserClass(String k)
	{
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("ExtentRepoter.html");
		report=new ExtentReports();
		report.attachReporter(htmlReporter);
		test=report.createTest("VerifyUserCanLoginToGroww");
		driver=Base_Class.getDriver(k);
//		Set<Cookie> allcookies=driver.manage().getCookies();
//		System.out.println("count of cookies"+ allcookies.size());
//		for(Cookie cookie:allcookies)
//		{
//			System.out.println(cookie.getName());
//			System.out.println(cookie.getDomain());
//			System.out.println(cookie.getPath());
//		}
//		driver.manage().deleteAllCookies();
//	    Set<Cookie>AfterDel=driver.manage().getCookies();	
//	    System.out.println(AfterDel.size());
//	
	}
	@BeforeMethod
	public void beforeMethod()
	{
		lp=new Login_Page(driver);
		 
	}
	@Test
	public void VerifyUserIsAbletoLoginOrNot() throws IOException
	{
		lp.VerifyUserAbletoClickOnLoginbtn();
		lp.VerifyUserCanEnterEmail();
		lp.VerifyUserCanClickOnContinueButton();
		lp.VerifyUserCanClickOnEnterPassword();
		lp.VerifyUserCanClickOnsubmitbutton();
		lp.otpVerification();
	}
	
	@AfterMethod //after method madhe listener vapra lagte.
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"Test is passed"+result.getName());
		}
		else
		{    String path=lp.getDataFromPropertyFile("");
			test.log(Status.FAIL, "Test is Failed" +result.getName(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
	}
	
	@AfterClass
	public void afterClass()
	{		report.flush();
	}
}
