package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.OnlineCourses;
import pomPages.SkilraryLoginPage;
import pomPages.SkilraryServices;

public class TestCase4 extends BaseClass {
	
	@Test
	public void Tc4() throws InterruptedException {
		
		SkilraryLoginPage s = new SkilraryLoginPage(driver);
		s.Servicebutton();
		s.BusinessButton();
		
		SkilraryServices ss=new SkilraryServices(driver);
		utilies.switchingTabs(driver);
		Thread.sleep(2000);
		utilies.scrollBar(driver, 500, 0);
		
		utilies.mouseHover(driver, ss.getSoftwareTesting());
		Thread.sleep(3000);
		ss.getSoftwareTesting();
		ss.Automation();
		
		
		
		utilies.switchingTabs(driver);	
		OnlineCourses o=new OnlineCourses(driver);
		
		utilies.mouseHover(driver, o.Accept());
		
	     Thread.sleep(3000);
		o.Watch();
		  
		o.serchbtn();
		utilies.switchframe(driver);
		
		
		o.Play();
		Thread.sleep(10000);
		o.Pause();   
		utilies.switchbackframe(driver);
		o.catButton();
	}

}
