package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	
	public String getPropertyFiledata(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyFilePath);
		
//		FileInputStream fis2 = new FileInputStream(AutoConstant.locatorpropertyFilePath);
//		p.load(fis2);
		
		p.load(fis);
		return p.getProperty(key) ;
		
	}

}
