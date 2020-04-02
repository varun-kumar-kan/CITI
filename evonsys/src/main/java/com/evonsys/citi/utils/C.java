package com.evonsys.citi.utils;

import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;

import junit.framework.Assert;

public class C extends Base{
	int i = 1;
	@Test
	public void testoginC(){
		if(i==3){
			Assert.assertTrue(true);
		}else{
			System.out.println(i);
			i++;
			Assert.assertTrue(false);
		}
		
	}
}
