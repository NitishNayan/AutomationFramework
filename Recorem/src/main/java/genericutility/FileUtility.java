package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String  getDataFromProperty(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\commandata.property");
		Properties pro =new Properties();
		pro.load(fis);
		return pro.getProperty(key);
		
		
	}

}


