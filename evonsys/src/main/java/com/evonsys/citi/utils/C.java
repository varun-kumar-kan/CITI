package com.evonsys.citi.utils;

import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;

import junit.framework.Assert;

public class C{
	/*int i = 1;
	@Test
	public void testoginC(){
		System.out.println(System.getProperty("1"));
}		*/

	public static void main(String[] args) {
		String s = "Anusha";
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length;i++){
			String temp = s.substring(i);
			
			System.out.println(temp);
			String t1 = temp+ch[i];
			System.out.println(":="+t1);
			
		}
	}
}
