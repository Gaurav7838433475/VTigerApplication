package Practice_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderss {

	@Test(dataProvider="storeYourData")
	public void getData(String src,String des,int rs)
	{
		System.out.println(src+"=========> "+des+"======> "+rs);
	}
	
	@DataProvider
	public Object[][] storeYourData()
	{
		Object[][] obj=new Object[3][3];
		obj[0][0]= "Tata";
		obj[0][1]= "Ranchi";
		obj[0][2]=100;
		
		obj[1][0]="Patna";
		obj[1][1]="delhi";
		obj[1][2]=200;
		
		obj[2][0]="rajesthan";
		obj[2][1]="merat";
		obj[2][2]=300;
		
		return obj;
	}
}
