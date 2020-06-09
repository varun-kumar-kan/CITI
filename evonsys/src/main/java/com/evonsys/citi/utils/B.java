package com.evonsys.citi.utils;

import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;

import junit.framework.Assert;

public class B {
	int i = 1;
	
	@Test
	public void testoginB(){
		System.setProperty("1", "varun");
		System.out.println(System.getProperty("1"));
		
		
		System.out.println(System.getProperty("os"));
	}

}
