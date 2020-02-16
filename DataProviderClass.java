package com.dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="diff")
	public static Object[][]dp(){
		Integer[] i1 = new Integer[]{1,2,3};
		Integer[]i2 = new Integer[]{5,6,11};
		Integer [][] data = new Integer[][]{i1,i2};
		return data;
	}

}
