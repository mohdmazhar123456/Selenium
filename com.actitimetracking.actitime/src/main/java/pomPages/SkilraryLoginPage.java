 package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilraryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement  gearBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	@FindBy(xpath="//a[text()=' SERVICES ']")
	private WebElement Servicebutton;
	
	@FindBy(xpath="//a[text()=' SkillRary Business']")
	private WebElement BusinessButton;
	
	@FindBy(xpath="//a[text()='Corporates']")
	private WebElement Corporates;
	
	@FindBy(xpath="//a[text()='Course']")
	private WebElement Course;
	


	public SkilraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearButton() {
		gearBtn.click();
	}
	
	public void skilrarydemoapp() {
		demoApp.click();
	}
	public void Servicebutton() {
		Servicebutton.click();
	}

	public void BusinessButton() {
		 BusinessButton.click();
	}
	
	public void CorporatesButton() {
		Corporates.click();
	}
	
	public void CourseButton() {
		Course.click();
	}
	
}
