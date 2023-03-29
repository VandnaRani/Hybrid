package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
		prop .load(fis);
	} catch(FileNotFoundException fnfe) {
		fnfe.printStackTrace();
	}catch(IOException ioe){
		ioe.printStackTrace();
	} finally {
		fis.close();
		
	}
		return prop;
	
			
		
	}
}
