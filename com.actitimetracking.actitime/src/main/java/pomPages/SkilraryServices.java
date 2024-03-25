package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilraryServices {
	
	
	
	@FindBy(xpath="//p[text()='Software Testing']")
	private WebElement SoftwareTesting;
	
	@FindBy(xpath="//button[text()='Test Automation - Selenium, QTP, TestComplete, Katalon']")
	private WebElement TestAutomation;
	
	public SkilraryServices(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
	}

	
	public void Automation()   {
		TestAutomation.click();
	}

	public WebElement getSoftwareTesting() {
		return SoftwareTesting;
	}

}

