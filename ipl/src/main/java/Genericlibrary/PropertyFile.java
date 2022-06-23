package Genericlibrary;

import java.io.FileInputStream;
import java.util.Properties;

import Genericlibrary.IPathConstants;

public class PropertyFile {

	public String readDataFromPropertyFile(String key) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(IPathConstants.FilePath);
		Properties pLib = new Properties();
		pLib.load(fis);
		String value=pLib.getProperty(key);
		return value;
		
	}

	
}
