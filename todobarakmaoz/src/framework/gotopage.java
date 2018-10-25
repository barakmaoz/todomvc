package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gotopage

{
	
	public static WebDriver driver = new ChromeDriver();
	
	public static WebDriver give()
	{
		return driver;
	}
	
	public static void gototheweb() throws Exception
	{
		 
		driver.get("http://todomvc.com/examples/react/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	public static void goback() throws Exception
	{
	driver.navigate().back();
	Thread.sleep(1000);
	}

}
