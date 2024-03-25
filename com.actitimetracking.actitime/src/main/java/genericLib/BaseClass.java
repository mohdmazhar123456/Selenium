package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFile pdata=new PropertyFile();   //Method Calling Create an object (Non static method)
//	public PropertyFile ldata=new PropertyFile();    //for get locators
	public WebDriverUtilies utilies=new WebDriverUtilies();
	
	
	@BeforeMethod
	public void openApp( ) throws IOException {
		WebDriverManager.chromedriver().setup();   //Open Chrome Browser   any browser you can open
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyFiledata("url"));     //call it from line no.16
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException  //ItestResult result for check screnshot taking or not
	{
		int status = result.getStatus();   //it is used to get the status of test cases
		String name = result.getName();    //this will give you the testcase which will get fail
		
		if(status==2) {      //1=pass,2=fail
			Screenshot s = new Screenshot();
			s.getphoto(driver, name);
			
		}
		driver.quit();
	}


}
