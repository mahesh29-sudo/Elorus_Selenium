package dataProviders;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.baseTest;
import generic.webActionUtil;

public class elorusdataProvider {
	@DataProvider
	public Object[] demoDataProv()
	{
		Object[] data= new Object[4];
		data[0]="sam";
		data[1]='$';
		data[2]=200;
		data[3]=false;
		return data;
	}
	@Test(dataProvider="demoDataProv")
	public void demoScript(Object var)
	{
		System.out.println(var);
	}
	
	@DataProvider(parallel=true)
	public Object[][] fbLoginData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "abc@gmail.com";
		data[0][1] = "124568";
		
		data[1][0] = "xyz@gmail.com";
		data[1][1] = "584697";
		
		data[2][0] = "mno@gmail.com";
		data[2][1] = "547858";
		
		return data;
	}
	
	@DataProvider
	public Object[][] elorusData()
	{
		Object[][] data= new Object[1][6];
		data[0][0]= webActionUtil.getData(baseTest.excelPath, "adduser", 1,0);
		data[0][1]= webActionUtil.getData(baseTest.excelPath, "adduser", 1,1);
		data[0][2]= webActionUtil.getData(baseTest.excelPath, "adduser", 1,2);
		data[0][3]= webActionUtil.getData(baseTest.excelPath, "adduser", 1,3);
		data[0][4]= webActionUtil.getData(baseTest.excelPath, "adduser", 1,4);
		data[0][5]= webActionUtil.getData(baseTest.excelPath, "adduser", 1,5);
		return data;
	}	
}
