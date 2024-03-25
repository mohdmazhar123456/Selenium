package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Course {
	
	@FindBy(xpath="//span[text()='Featured']")
	private WebElement Analytics ;
	
	@FindBy(xpath="//h4[text()='LEARN ON THE GO!']")
	private WebElement learn;
	
	@FindBy(xpath="//a[text()=' Services ']")
	private WebElement Services;
	
	public Course(WebDriver driver) {
	   PageFactory.initElements(driver, this);
	}
	


	public void  Analytics() {
		Analytics.click();
	}
	public void Learn()   {
		learn.click();
	}
	public void Services() {
		Services.click();
	}
	
	
	
	

}
