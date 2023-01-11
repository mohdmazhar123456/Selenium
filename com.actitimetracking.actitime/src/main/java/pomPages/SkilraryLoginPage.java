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
	
	public SkilraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearButton() {
		gearBtn.click();
	}
	
	public void skilrarydemoapp() {
		demoApp.click();
	}

}
