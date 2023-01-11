package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCardPage {

	
	@FindBy(id="add")
	private WebElement add;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public AddtoCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}
	
	public void addtocardButton() {
		addtocart.click();
	}
}
