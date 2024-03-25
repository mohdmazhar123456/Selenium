 package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class WebDriverUtilies {
	
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
			
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void movetoelement(WebDriver driver,WebElement ele) {
		
		Actions a=new Actions(driver);
		a.moveToElement(ele);
	}
	
	public void rightClick(WebDriver driver,WebElement ele) {
		
		Actions a=new Actions(driver);
		a.contextClick(ele);
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		
		Actions a =new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target) {
		
		Actions a=new Actions(driver);    
		a.dragAndDrop(source, target).perform();
	}
	
	public void KeyDown(WebDriver driver,WebElement ele)   {
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).perform();
	}
	public void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	  
	public void alertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchbackTab(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	public void switchingTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String c:child) {
			driver.switchTo().window(c);
		}
	}
	
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+" ,"+y+")");
		
	}
}
