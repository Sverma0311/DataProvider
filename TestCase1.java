package com.dataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	@  Test(dataProvider="diff", dataProviderClass = DataProviderClass.class)
	public void test(int a, int b, int c){
		int d = a+b;
		Assert.assertEquals(c, d);
	}

}
