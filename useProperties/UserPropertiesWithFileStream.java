package useProperties;

import java.util.Properties;
import java.util.Enumeration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UserPropertiesWithFileStream {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			// FileNotFoundException is Checked Exception;
			FileInputStream input = new FileInputStream("src/useProperties/input.txt");
			// IOException is Checked Exception
			prop.load(input);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Enumeration en = prop.keys();
		
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			System.out.println(key + "   " + prop.getProperty(key));
		}
		
		
		
	}

}
