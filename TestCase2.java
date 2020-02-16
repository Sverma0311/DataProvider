package com.dataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test(dataProvider ="multi")
	public void test2(int a, int b, int c){
		int d = (a*b);
		Assert.assertEquals(d, c);
		System.out.println(d);
	}
	@DataProvider(name="multi")
	private Object[][]cal(){
		Integer[]i1 = new Integer[]{2,5,10};
		Integer[]i2=new Integer[]{5,0,0};
		Integer[]i3 = new Integer[]{0,0,10};
		Integer[][] result = new Integer[][]{i1,i2,i3};
		return result;
		
	}

}
