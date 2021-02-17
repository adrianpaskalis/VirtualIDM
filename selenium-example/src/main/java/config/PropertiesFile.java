package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static 	Properties pop = new Properties(); 
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() {
		try { 
			
			InputStream input = new FileInputStream(projectPath+"/src/main/java/config/config.properties");
			pop.load(input);
			String browser = pop.getProperty("browser");
			System.out.println(browser);
			TestNgExtendReports.browserName = browser; 
//			TestNgExtendReports.browserName= browser;
			
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(	exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/main/java/config/config.properties");
			pop.setProperty("browser", "chrome");
			pop.store(output, null);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	

}
