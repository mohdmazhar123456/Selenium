package testscripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCardPage;
import pomPages.SkilraryDempApp;
import pomPages.SkilraryLoginPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() {
		
		SkilraryLoginPage s = new SkilraryLoginPage(driver);
		s.gearButton(); 
		s.skilrarydemoapp();
		
		SkilraryDempApp d = new SkilraryDempApp(driver);
		utilies.switchingTabs(driver);
		utilies.mouseHover(driver, d.getCoursetab());
		d.seleniumtrainingtab();
		
		AddtoCardPage ad=new AddtoCardPage(driver);
		utilies.doubleClick(driver, ad.getAdd());
		//utilies.alertPopUp(driver);         //no such alert pupup 
	}

}
