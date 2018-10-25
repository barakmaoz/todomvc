package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class menudownclick 
{
	
	public static WebDriver driver = framework.gotopage.give();
	
	public static void Tutorial() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/ul[1]/li[1]/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :Tutorial");
				}		 
			
	
	}
	
	
	public static void Philosophy() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/ul[1]/li[2]/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :Philosophy");
				}		 
			
	
	}
	
	public static void Support() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/ul[1]/li[3]/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :Support");
				}		 
			
	
	}
	
	public static void Fluxarchitectureexample() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/ul[1]/li[4]/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :Fluxarchitectureexample");
				}		 
			
	
	}
	
	
	public static void ReactJSonStackOverflow() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/ul[2]/li[1]/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :ReactJSonStackOverflow");
				}		 
			
	
	}
	
	public static void GoogleGroupsMailing() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/ul[2]/li[2]/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :GoogleGroupsMailing");
				}		 
			
	
	}
	
	public static void IRC() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/ul[2]/li[3]/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :IRC");
				}		 
			
	
	}
	
	
	
	
	public static void letusknow() throws Exception
	{
		try {
			 driver.findElement(By.xpath("/html/body/aside/footer/em/a")).click();}
			 catch (Exception e) 
				{
				System.out.println("cant find the elemnt :letusknow");
				}		 
			
	
	}
	
	
}
