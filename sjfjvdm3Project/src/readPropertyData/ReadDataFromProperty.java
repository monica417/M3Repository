package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		//To specify the location of the file properties
		
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		
		//To make the file ready to read
		Properties prop = new Properties();
		prop.load(fis);
		
		//To read the data from property File
		
		String data = prop.getProperty("password");
		
		System.out.println(data);

	}

}
