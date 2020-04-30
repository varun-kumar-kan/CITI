package com.evonsys.citi.utils;

import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;

import junit.framework.Assert;

public class A  {
//	@Test
//	public void testLogin(){
//		Assert.assertTrue(true);
//		
//	}
	
	public static int a;
	public static void m1(){
		System.out.println("1");
	}
	static void  m2(){
		System.out.println("2");
	}
	public static void main(String[] args) {
		System.out.println(a);
		A.m2();
	}
}
