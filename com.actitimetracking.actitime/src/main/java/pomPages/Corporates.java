package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corporates {
/*	
	@FindBy(xpath="//a[text()='Corporates']")
	private WebElement Corporates; 
	*/
	@FindBy(xpath="//p[text()='Programing Languages']")
	private WebElement ProgramingL;
	
	@FindBy(xpath="(//h3[text()='Our Training Methods'])[1]")
	private WebElement Training;
	
	@FindBy(xpath="//button[text()='SQL']")
	private WebElement SQL;
	
	@FindBy(xpath="//h4[text()='LEARN ON THE GO!']")
	private WebElement Learn;
	
	@FindBy(xpath="//a[text()=' Blogs ']")
	private WebElement Blogs;
	
	@FindBy(xpath="//a[text()=' Contact Us ']")
	private WebElement Contact;

	public Corporates(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

    public WebElement getProgramingL() {
		return ProgramingL;
	}

    public void Training() {
    	Training.click();
    }
    
	public void SQL() {
    	SQL.click();
    }
	
	public void Learn() {
		Learn.click();
	}
	
	public void Blogs() {
		Blogs.click();
	}
	
	public void Contect() {
		Contact.click();
	}
	
}
