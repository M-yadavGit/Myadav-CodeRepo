package com.DemoWebShopOne.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromProperty(String path, String key) throws IOException {
		FileInputStream file = new FileInputStream(path);
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(key);
	}

}
