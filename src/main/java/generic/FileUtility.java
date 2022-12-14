package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	/**
	 * This method is used to read data from property file
	 * @author kavya
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	
public String readDataFromPropertyFileAdmin(String key)throws Throwable
{
	FileInputStream	fis=new FileInputStream(".\\src\\test\\resources\\data.properties");
	Properties pObj = new Properties();
	pObj.load(fis);
	String value= pObj.getProperty(key);
	return value;
}

public String readDataFromPropertyFileDoctor(String key)throws Throwable
{
	FileInputStream	fis=new FileInputStream(".\\src\\test\\resources\\CommonData2.properties");
	Properties pObj = new Properties();
	pObj.load(fis);
	String value= pObj.getProperty(key);
	return value;
}
public String readDataFromPropertyFilePatient(String key)throws Throwable
{
	FileInputStream	fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	Properties pObj = new Properties();
	pObj.load(fis);
	String value= pObj.getProperty(key);
	return value;
}

}

