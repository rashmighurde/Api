package testclasses;
import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomclasses.Home_Page;
import pomclasses.Login_Page;

public class checkboxPractice{

	public static void main(String[] args) throws InterruptedException {
		
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();		
/*  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,'day')]"));
	//driver.findElement(By.xpath("//input[@id='monday']")).click();
	
//	for(WebElement k:checkboxes)
//	{
//		k.click();
//	}
	//select multiple checkboxes by choice
	for(WebElement k:checkboxes)
	{   String check=k.getAttribute("id");
		if(check.equals("monday")||check.equals("wednesday"))
		{ 
			k.click();
		}
	}
	
	List<WebElement>radiobtns=driver.findElements(By.xpath("//input[@type='radio' and contains(@value,'option')]"));
	
	
	for(WebElement k:radiobtns)
	{   String id=k.getAttribute("id");
		if(id.equals("male"))
		{
		k.click();
		}
	}
	
	
	WebElement path=driver.findElement(By.xpath("//select[@class='custom-select']"));
	Select s=new Select(path);
	s.selectByIndex(0);
	s.selectByValue("3");
	Thread.sleep(4000);
	s.selectByVisibleText("Spain");
	System.out.println(s.getFirstSelectedOption().getText());
	List<WebElement> options=s.getOptions();
	for(WebElement k:options)
	{
		System.out.println(k.getText());
	}
	*/
	
	driver.get("https://www.flipkart.com/");    
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	
	Home_Page hp=new Home_Page(driver);
	hp.GetElementsFromTheList();
	for(int i=0;i<5;i++)
	{
		String newTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	driver.switchTo().newWindow(WindowType.TAB);
//	Set<String> handles =driver.getWindowHandles();
//	List<String>handles1=new ArrayList<String>(handles);
	
	List<String>handles1=new ArrayList<String>(driver.getWindowHandles());
	if(i==1)
	{
	driver.switchTo().window(handles1.get(i));
	break;
	}
	}
//	System.out.println(handles1.get(0));
//	System.out.println(handles1.get(1));
	
	}
	}
	
	
