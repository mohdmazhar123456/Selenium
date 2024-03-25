package testscripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkilraryLoginPage;

public class TestCase6 extends BaseClass {
	
	@Test
	public void tc4() throws InterruptedException  {
		SkilraryLoginPage s=new SkilraryLoginPage(driver);
		s.CourseButton();
		
		utilies.switchbackTab(driver);
		
		Course c= new Course(driver);
		c.Analytics();
		utilies.switchbackTab(driver);
		c.Learn();
		c.Services();
		
			
		
	}

}
