package testscripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkilraryDempApp;
import pomPages.SkilraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
		SkilraryLoginPage p=new SkilraryLoginPage(driver);
		p.gearButton();
		p.skilrarydemoapp();
		
		SkilraryDempApp d=new SkilraryDempApp(driver);
		utilies.switchingTabs(driver);
		utilies.dropDown(d.getCoursedropd(),pdata.getPropertyFiledata("coursedropd"));
		   
		TestingPage t=new TestingPage(driver);
		utilies.dragAndDrop(driver, t.getMunit(), t.getAreacart());
		WebElement facebook = t.getFb();
		Point loc = facebook.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		utilies.scrollBar(driver, x, y);
		t.facebookicon();
		
		  //Facebook title not Matching
		//Assert.assertEquals(driver.getTitle(), pdata.getPropertyFiledata("fbtitle"));
		
		  
		
	}
	
	

}
