package com.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_test {
	@Test
	public void testAddNum1(){
		
		JunitTest1 ts=new JunitTest1();
		ts.addNum(3, 6);
	}
	
	@Test
	public void testAddNum2(){
		
		JunitTest1 ts=new JunitTest1();
		ts.addNum(3, 6);
	}
	
	@After
	public void testm2(){
		JunitTest1 ts=new JunitTest1();
		ts.method2();
	}
	
	@Ignore
	public void testm3(){
		JunitTest1 ts=new JunitTest1();
		ts.method3();
	}
	
	@Before
	public void testm4(){
		JunitTest1 ts=new JunitTest1();
		ts.method4();
	}
}
