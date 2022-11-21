package Practice_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	@Test(dataProvider="getData")
	public void travelling(String src,String des,int rs)
	{
		System.out.println(src+"------>"+des+"------>"+rs);
	}

	
	/*@Test(dataProvider="getData")
	public void travelling(String src,String des)
	{
		System.out.println(src+"------------->"+des);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="Bangalore";
		obj[0][1]="Goa";
		
		obj[1][0]="Goa";
		obj[1][1]="Bangalore";
		
		return obj;
	}*/
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] obj=new Object[2][3];
		
		obj[0][0]="bangalore";
		obj[0][1]="goa";
		obj[0][2]=1000;
		
		obj[1][0]="goa";
		obj[1][1]="bangalore";
		obj[1][2]=2000;
		
		return obj;
	}
}
