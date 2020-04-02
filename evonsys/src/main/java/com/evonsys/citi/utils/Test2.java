package com.evonsys.citi.utils;

import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.assertion.AssertionUtil;

public class Test2 extends Base{
	
	@Test
	public void test(){
		AssertionUtil.makeTrue();
	}
	@Test
	public void test1(){
		AssertionUtil.makeFalse();
	}
	@Test
	public void test3(){
		AssertionUtil.makeTrue();
	}
	@Test
	public void test2(){
		AssertionUtil.makeFalse();
	}
	
}
