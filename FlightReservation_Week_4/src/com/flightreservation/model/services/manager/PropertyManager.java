package com.flightreservation.model.services.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.flightreservation.model.business.exception.PropertyFileNotFoundException;

public class PropertyManager {
	
	private static Properties properties;
	
	public static void loadProperties(String proFileLocation) throws PropertyFileNotFoundException {
		
		properties = new Properties();
		FileInputStream fileInputStream = null;
		
		try {
			
			fileInputStream = new FileInputStream(proFileLocation);
			properties.load(fileInputStream);
			
			System.out.println("Property file successfully loaded from : "+proFileLocation);
			System.out.println(properties.toString());
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Property File Not found");
			throw new PropertyFileNotFoundException("File cannot be found", e);
		}catch(IOException e) {
			System.out.println("IOException while loading file");
			throw new PropertyFileNotFoundException("IOException while loading", e);
			
		}
		catch(Exception e) {
			
			System.out.println("Exception while loading file");
			throw new PropertyFileNotFoundException("Exception while loading file", e);
			
		}finally {
			try {
				if(fileInputStream != null) {
					fileInputStream.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public static String getProperties(String key) {
		return properties.getProperty(key);
	}

}
