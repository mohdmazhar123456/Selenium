package testscripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Corporates;
import pomPages.SkilraryLoginPage;

public class TestCase5 extends BaseClass {
	@Test
	
	public void Tc5() throws InterruptedException {
		SkilraryLoginPage s=new SkilraryLoginPage(driver);
		s.CorporatesButton();
		
		utilies.switchingTabs(driver);
		Corporates c=new Corporates(driver);
	    
	    c.Training();
	    utilies.mouseHover(driver, c.getProgramingL());
	    c.SQL();
	    utilies.switchingTabs(driver);
	    Thread.sleep(6000);
	    c.Learn();
	    c.Blogs();
	    utilies.switchbackframe(driver);
	    Thread.sleep(6000);
	    c.Contect();

	}


}
