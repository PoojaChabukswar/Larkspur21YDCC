package com.resonance.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	/**
	 * This method will read the value from properties file
	 * @param filepath
	 * @param key
	 * @return
	 */
	public String getValue(String filepath,String key) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		

	}
	
	public String[] getLocator(String key) {
		String dir=System.getProperty("user.dir")+"src/main/resources/OR.properties";
		 String locator= getValue(dir, key);
		 String parts[]=locator.split("##");
		return parts;

	}

}
