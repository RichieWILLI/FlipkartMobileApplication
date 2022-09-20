package GenericUtities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtilities {
	public FileInputStream fis;
	public Properties pro;
	
	public void fetchingPropertyData(String filePath) {
		try {
			fis= new FileInputStream(filePath);
			pro =new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String loadPropertyFile(String key) {
		String value = pro.getProperty(key);
		return value;
	}

}
