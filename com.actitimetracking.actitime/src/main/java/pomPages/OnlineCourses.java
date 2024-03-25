package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineCourses {
	
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement AcceptButton;
	
	@FindBy(name="q")
	private WebElement SearchButton;
	
	@FindBy(xpath="//h3[text()='University & Institutions ']")
	private WebElement Watchlisten;
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement Playbutton;
	
	@FindBy(xpath="//button[@data-title-no-tooltip='Pause']")
	private WebElement Pausebutton;
	
	
	
	@FindBy(xpath="//a[text()='CATEGORIES']")
	private WebElement Categories;
	
	public OnlineCourses(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Accept() {
		AcceptButton.click();
		return AcceptButton;
	}
	
	public void serchbtn() {
		SearchButton.click();
	}

	public void Watch() {
		 Watchlisten.click();
	}

	public void Play() {
		 Playbutton.click();
	}

	public void Pause() {
		Pausebutton.click();
	}
	
	public void catButton() {
		Categories.click();
	}
	
	

}
