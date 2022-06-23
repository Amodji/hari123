package Genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * this class will read data from property file and return value to user
 * @author home
 *
 */
public class PropertyFileUtility {
/**
 * this class will read data from property file for the key given by the user &
 * return value to the user
 * @param key
 * @return
 * @throws Throwable
 */
	public String readDataFromPropertyFile(String key) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(IPathConstants.FilePath);
		Properties pLib = new Properties();
		pLib.load(fis);
		String value=pLib.getProperty(key);
		return value;
		
	}



}
