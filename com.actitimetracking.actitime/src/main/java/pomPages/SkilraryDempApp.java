package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilraryDempApp {
	
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement coursedropd;
	
	public SkilraryDempApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetab() { //generate getter method
		return coursetab;
	}
	

	public WebElement getCoursedropd() {
		return coursedropd;
	}

	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

}
