package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
static Properties prop;
	
	public static String getProperty(String key){
		
		prop = new Properties();
		String GlobalPropertypath ="D:\\FrameWork\\src\\test\\java\\com\\testBase\\GlobalProperties.properties";
	
			try {
				prop.load(new FileInputStream(GlobalPropertypath));
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		
		
		return prop.getProperty(key);	
		
	}

}
