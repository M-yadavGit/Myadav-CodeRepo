package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib {
	public static String getdatafromproperty(String path, String key) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
		
	}

}
