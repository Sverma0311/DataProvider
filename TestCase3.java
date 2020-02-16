package com.dataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase3 {

	@Test(dataProvider="sum")
	public void test3(int a, int b, int c){
		int d = a+b;
		Assert.assertEquals(c, d);
		System.out.println(d);
	}
	
	@DataProvider(name="sum")
	private Object[] dp(){
		Integer res[]={1,2,3};
		return res;
	}
	
}
