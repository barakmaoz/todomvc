package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class menuop 

{
	public static WebDriver driver = framework.gotopage.give();
	
	
		
		public static void create(String name) throws InterruptedException
		{
			driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(name);
			driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		}
		
	
	public static void editTodo(int i,String text) throws Exception
	{	try {
		Actions action = new Actions(driver);
		
		WebElement edit = driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/div/label"));
		action.moveToElement(edit).doubleClick().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/input")).clear();
		driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/input")).sendKeys(text);
					
		driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/input")).sendKeys(Keys.ENTER);
	}
		catch (Exception e) 
		{
		System.out.println("cant find the elemnt: editTodo");
		}		
	}
	
	public static String gettextfromthelist(int i) throws Exception
	{	try {
		
		WebElement edit = driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/div/label"));
		return edit.getText();
	}
		catch (Exception e) 
		{
		System.out.println("cant find the elemnt: gettext");
		}
		return null;		
	}
	
	public static int countAll() throws Exception
	{
		
		 List<WebElement> lst =driver.findElements(By.xpath("/html/body/section/div/section/ul/li"));
		 
	
		return lst.size();
		
	}
	
	public static int counTtodo() throws Exception
	{
			int completed=0;
		 	List<WebElement> lst =driver.findElements(By.xpath("/html/body/section/div/section/ul/li"));
		 	for (int i = 1; i <= lst.size(); i++) 
		 	{
		 		WebElement selceted = driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]"));
		 		String ss = selceted.getAttribute("class");
		 		if(ss.equals("completed"))
		 		{
		 			completed++;
		 		}
		 		
			}
		 	return (lst.size()-completed);
		 	
	}
	
	public static int countWeb() throws Exception
	{
		WebElement countb = driver.findElement(By.xpath("/html/body/section/div/footer/span/strong"));
		int x =Integer.parseInt(countb.getText());	
		return x;
	}
	
	public static void clickV(int i) throws Exception
	{
		try {
		 driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/div/input")).click();}
		 catch (Exception e) 
			{
			System.out.println("cant find the elemnt :clickV");
			}		
	}
	
	public static void deleteTodo(int i) throws Exception
	{
		try {
		Actions action = new Actions(driver);
		
		WebElement deleted = driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/div/label"));
		action.moveToElement(deleted).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]/div/button")).click();}
		catch (Exception e) 
		{
		System.out.println("cant find the elemnt in deleteTodo");
		}		
	}
	
	public static void movetoAll() throws Exception
	{
		try
			{
			driver.findElement(By.xpath("/html/body/section/div/footer/ul/li[1]/a")).click();
			}
		catch (Exception e) 
			{
			System.out.println("cant find the elemnt: movetoAll");
			}		
		Thread.sleep(3000);
	}
	public static void movetoActive() throws Exception
	{
		try
		{
		driver.findElement(By.xpath("/html/body/section/div/footer/ul/li[2]/a")).click();
		}
		catch (Exception e) 
		{
			System.out.println("cant find the elemnt: movetoActive");
		}		
		Thread.sleep(3000);
	}
	public static void movetoCompleted() throws Exception
	{
		try
		{
		driver.findElement(By.xpath("/html/body/section/div/footer/ul/li[3]/a")).click();
		}
		catch (Exception e) 
		{
			System.out.println("cant find the elemnt:movetoCompleted ");
		}		
		Thread.sleep(3000);
	}
	public static void deleteCompleted() throws Exception
	{	
		Thread.sleep(3000);
		try
		{
		driver.findElement(By.xpath("/html/body/section/div/footer/button")).click();
		}
		catch (Exception e) 
		{
			System.out.println("cant find the elemnt");
		}
		
		
		Thread.sleep(3000);
	}
	
	public static void selctall() throws Exception
	{	
		
		Thread.sleep(3000);
		try
		{
				driver.findElement(By.xpath("/html/body/section/div/section/label")).click();
		}
		catch (Exception e) 
			{
				System.out.println("cant find the elemnt");
			}
	
	
			Thread.sleep(3000);
	}
	
	public static int complet() throws Exception
	{
			int completed=0;
		 	List<WebElement> lst =driver.findElements(By.xpath("/html/body/section/div/section/ul/li"));
		 	for (int i = 1; i <= lst.size(); i++) 
		 	{
		 		WebElement selceted = driver.findElement(By.xpath("/html/body/section/div/section/ul/li["+i+"]"));
		 		String ss = selceted.getAttribute("class");
		 		if(ss.equals("completed"))
		 		{
		 			completed++;
		 		}
		 		
			}
		 	return completed;
		 	
	}

	
	
	
	

	
	
			
	
	
	
}
