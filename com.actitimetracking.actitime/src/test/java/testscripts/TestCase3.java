package testscripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkilraryLoginPage;
import pomPages.SkilraryServices;

public class TestCase3 extends BaseClass{
	@Test
	public void Tc3() throws InterruptedException {
		
		SkilraryLoginPage s = new SkilraryLoginPage(driver);
		s.Servicebutton();
		s.BusinessButton();
		
		SkilraryServices ss=new SkilraryServices(driver);
		utilies.switchingTabs(driver);
		Thread.sleep(3000);
		utilies.scrollBar(driver, 500, 0);
		
		utilies.mouseHover(driver, ss.getSoftwareTesting());
		Thread.sleep(3000);
		ss.getSoftwareTesting();
		
		ss.Automation();
		
		

	}

}
