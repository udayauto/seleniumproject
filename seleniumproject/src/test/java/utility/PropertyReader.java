package utility;
import java.io.FileInputStream;
import java.util.Properties;
public class PropertyReader {
	
	public static String readProperty(String key) throws Exception {
		
		String path = "C:\\Users\\udayk\\Downloads\\seleniumproject\\seleniumproject\\src\\test\\resources\\config.properties";
	
		//open file in read mode.
		FileInputStream fopen = new FileInputStream(path);
	
		Properties prop = new Properties();
		//loading the file.
		prop.load(fopen);
		
		// fetch for a value -----key
		String value = prop.getProperty(key);
		
		return value;
		
		
	}

}
