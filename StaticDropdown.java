package testclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseclasses.Base_Class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown {
	WebDriver driver;
	@Parameters({"Browser"})
	@BeforeClass 
	public void driverInitialization(String k)
	{
		Base_Class.getDriver(k);
	}
   @Test
   public void staticDropDown()
   {    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   WebElement search= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id=\"searchLanguage\"]"))));
	   search.click();
	   Select s=new Select(search);
   s.selectByIndex(0);
   s.selectByValue("af");
   s.selectByVisibleText("English");
   }
	}


