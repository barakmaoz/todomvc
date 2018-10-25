package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class todo 
{

	public static WebDriver driver = framework.gotopage.give();
	
		@BeforeTest
		public  void openBrowser() throws Exception
		{
			
			framework.gotopage.gototheweb();
			
		}
		
		@Test
		public void todofanction() throws Exception 
		{
			
			framework.menuop.create("vvvvvv");
			framework.menuop.create("go to the gym");
			framework.menuop.create(" go to sleep at 23:30");
			//test1
			Assert.assertEquals(framework.menuop.counTtodo(), framework.menuop.countWeb(), "test faild the size1 not equals");
			System.out.println("test1: test size1 pass");
			//test2
			framework.menuop.editTodo(2, "go to wotk");	
			Assert.assertEquals(framework.menuop.gettextfromthelist(2), "go to wotk", "test failed dont change the text");
			System.out.println("test2: test edit pass");
			//test3
			framework.menuop.clickV(1);
			framework.menuop.countWeb();
			Assert.assertEquals(framework.menuop.countWeb(), 2, "test failed Was not removed from the list the completed");
			System.out.println("test3: test pass remove from the list the completed ");
			//test4
			framework.menuop.movetoCompleted();
			Assert.assertEquals(framework.menuop.complet(),framework.menuop.countAll(), "test failed dont add to completed");
			System.out.println("test4: test pass Moved to Completed ");
			//test5
			framework.menuop.movetoAll();
			framework.menuop.deleteCompleted();
			Assert.assertEquals(framework.menuop.countAll(),framework.menuop.counTtodo(), "test failed dont dont delete the completed");
			System.out.println("test5: test pass delete all Completed ");
			//test6
			framework.menuop.movetoCompleted();
			Assert.assertEquals(framework.menuop.countAll(),0, "test failed dont dont delete the completed");
			System.out.println("test6 :test pass delete all Completed from the completed list");
			//test7
			framework.menuop.movetoActive();
			Assert.assertEquals(framework.menuop.counTtodo(), framework.menuop.countWeb(), "test faild the size ative not equals");
			System.out.println("test7: test size ative pass");
			//test8
			framework.menuop.movetoAll();
			framework.menuop.selctall();
			Assert.assertEquals(0, framework.menuop.countWeb(), "test faild the size select not equals");
			System.out.println("test8: test size select pass");
			//test9
			framework.menuop.selctall();
			Assert.assertEquals(2, framework.menuop.countWeb(), "test faild the size select not equals");
			System.out.println("test9: test size select pass");
			//test10
			framework.menuop.deleteTodo(2);
			Assert.assertEquals(1, framework.menuop.countWeb(), "test faild the text dont deleted ");
			System.out.println("test10: the text deleted");
			
		}
		
		@AfterTest
		public  void closeBrowser() throws Exception
		{
			
			driver.quit();
			
		}

}
